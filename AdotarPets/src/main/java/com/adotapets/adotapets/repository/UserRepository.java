package com.adotapets.adotapets.repository;

import com.adotapets.adotapets.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
