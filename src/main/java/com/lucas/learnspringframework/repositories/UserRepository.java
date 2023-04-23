package com.lucas.learnspringframework.repositories;

import com.lucas.learnspringframework.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
