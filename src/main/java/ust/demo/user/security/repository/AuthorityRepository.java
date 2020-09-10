package ust.demo.user.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ust.demo.user.security.model.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
