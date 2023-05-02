package com.arrisdev.awsgitflow.repository;

import com.arrisdev.awsgitflow.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByEmailId(String emailId);
}
