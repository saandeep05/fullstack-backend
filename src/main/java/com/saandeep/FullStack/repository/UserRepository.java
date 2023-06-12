package com.saandeep.FullStack.repository;

import com.saandeep.FullStack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
