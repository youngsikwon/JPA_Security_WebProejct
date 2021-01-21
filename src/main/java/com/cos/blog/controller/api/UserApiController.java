package com.cos.blog.controller.api;


import com.cos.blog.dto.ResponseDto;
import com.cos.blog.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiController {



    @PostMapping("/api/user")
    public ResponseDto<Integer> save (@RequestBody User user){

    return new ResponseDto<Integer>(HttpStatus.OK, 1); // javaObject를 json으로 변환 리턴(JACKSON)
    }

}
