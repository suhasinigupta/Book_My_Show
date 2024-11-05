package com.suhasini.BookMyShow.repository;

import com.suhasini.BookMyShow.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Integer> {
    User findUserByEmail(String email);
}
