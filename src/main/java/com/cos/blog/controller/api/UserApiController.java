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

//    @Autowired
//    private HttpSession session;


    @Autowired
    private UserService userService;



    @PostMapping("/auth/joinProc")
    public ResponseDto<Integer>save(@RequestBody User user){
        System.out.println("UserApiController : save 호출");
        user.setRole(RoleType.USER);
        userService.join(user);
    return new ResponseDto<Integer>(HttpStatus.OK.value(), 1); // javaObject를 json으로 변환 리턴(JACKSON)
    }




}
//    @PostMapping("/api/user/login")
//    public ResponseDto<Integer> login(@RequestBody User user, HttpSession session){
//        System.out.println("로그인이 성공 하였습니다.");
//      User principal =  userService.login(user); // principal (접근주체)
//        if(principal != null){
//                session.setAttribute("principal", principal);
//        }
//        return new ResponseDto<Integer>(HttpStatus.OK.value(), 1); // javaObject를 json으로 변환 리턴(JACKSON)
//    }