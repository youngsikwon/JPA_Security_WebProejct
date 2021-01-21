package com.cos.blog.service;


import com.cos.blog.model.User;
import com.cos.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

//spring이 컴포넌트 스캔을 통해서 bean에 등록 해줌 IoC를 해준다
@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;

    @Transactional
    public Integer join(User user){
        try {
        userRepository.save(user);
        return 1;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("UserService : 회원가입() : " + e.getMessage());
        }
        return -1;



    }
}
