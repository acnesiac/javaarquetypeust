package com.coppel.usuario.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.coppel.usuario.security.model.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
