package com.example.spring.repository;

import com.example.spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findUserByNickname(String nickname);     //select * from user where nickname = #nickname#
}
