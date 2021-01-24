package com.cos.blog.repository;

import com.cos.blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


//DAO
//자동으로 bean 등록
// @Repository 생략 가능
public interface UserRepository extends JpaRepository<User, Integer> {


    //JPA Naming 쿼리
    // select * from user where username = ? and password = ?;
    User findByUsernameAndPassword(String username, String password);


//    @Query(value = "SELECT * FROM user WHERE username = ? and password = ?", nativeQuery = true)
//    User login(String username, String password);

}
