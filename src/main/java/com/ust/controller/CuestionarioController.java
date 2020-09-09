package com.ust.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.security.Principal;
import java.util.Optional;
import java.util.UUID;

import com.ust.Application;
import com.ust.service.CurrentUser;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CuestionarioController {

	private final static Logger log = Logger.getLogger(CuestionarioController.class);

	@RequestMapping(method = RequestMethod.GET, value = "/publisher/publish")
	public String provideUploadInfo(Model model) {
		return "publisher/publish";
	}


	private boolean createDirectoryIfNotExist(File dir) {
		if (!dir.exists()) {
			boolean created = dir.mkdirs();
			if (!created) {
				return false;
			}
		}
		return true;
	}

	public static String getFileName(long publisherId, String uuid) {
		return getDirectory(publisherId) + "/" + uuid + ".pdf";
	}

	public static String getDirectory(long publisherId) {
		return Application.ROOT + "/" + publisherId;
	}

}