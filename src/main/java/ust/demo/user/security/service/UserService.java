package ust.demo.user.security.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ust.demo.user.security.SecurityUtils;
import ust.demo.user.security.model.User;
import ust.demo.user.security.repository.UserRepository;

import java.util.Optional;

@Service
@Transactional
public class UserService {

   private final UserRepository userRepository;

   public UserService(UserRepository userRepository) {
      this.userRepository = userRepository;
   }

   @Transactional(readOnly = true)
   public Optional<User> getUserWithAuthorities() {
      return SecurityUtils.getCurrentUsername().flatMap(userRepository::findOneWithAuthoritiesByUsername);
   }

}
