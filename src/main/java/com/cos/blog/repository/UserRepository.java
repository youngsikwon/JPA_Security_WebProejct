package com.cos.blog.repository;

import com.cos.blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


//DAO
//자동으로 bean 등록
// @Repository 생략 가능
public interface UserRepository extends JpaRepository<User, Integer> {
    //SELECT * FROM user WHERE uysername = 1?;
    Optional<User> findByUsername(String username);



}
    //JPA Naming 쿼리
    // select * from user where username = ? and password = ?;
   //User findByUsernameAndPassword(String username, String password);
//    @Query(value = "SELECT * FROM user WHERE username = ? and password = ?", nativeQuery = true)
//    User login(String username, String password);







