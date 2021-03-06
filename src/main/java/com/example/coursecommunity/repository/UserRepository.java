package com.example.coursecommunity.repository;

import com.example.coursecommunity.entity.Organization;
import com.example.coursecommunity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
