package com.dsc.rankmakers.domain.user.dao;

import com.dsc.rankmakers.domain.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

    Boolean isExistingEmail(String email);
}
