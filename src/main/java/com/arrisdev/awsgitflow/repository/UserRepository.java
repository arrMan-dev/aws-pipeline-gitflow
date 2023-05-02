package com.arrisdev.awsgitflow.repository;

import com.arrisdev.awsgitflow.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Long, User> {
}
