package com.cos.blog.test;

import com.cos.blog.model.User;
import com.cos.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyControllerTest {

    @Autowired //ㅇ,;저
    private UserRepository userRepository;

    // http://localhost:8000/blog/dummy/join
    @PostMapping("/dummy/join")
    public String join(User user){
        System.out.println("username :" + user.getUsername());
        System.out.println("pawword :" + user.getPassword());
        System.out.println("Email :" + user.getEmail());
        System.out.println("role :" + user.getRole());
        System.out.println("createDate :" + user.getCreateDate());

        userRepository.save(user);
        return "회원가입이 완료되었습니다.";

    }
}
