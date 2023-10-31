package io.github.rpablo30.repository;

import io.github.rpablo30.user.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<CustomUser, String> {
    UserDetails findByLogin(String login);
}
