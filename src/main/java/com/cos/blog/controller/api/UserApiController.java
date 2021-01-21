package com.cos.blog.controller.api;


import com.cos.blog.dto.ResponseDto;
import com.cos.blog.model.RoleType;
import com.cos.blog.model.User;
import com.cos.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiController {


    @Autowired
    private UserService userService;



    @PostMapping("/api/user")
    public ResponseDto<Integer> save (@RequestBody User user){
        System.out.println("UserApiController : save 호출");
        user.setRole(RoleType.USER);
        int result = userService.join(user);

    return new ResponseDto<Integer>(HttpStatus.OK.value(), 1); // javaObject를 json으로 변환 리턴(JACKSON)
    }

}
