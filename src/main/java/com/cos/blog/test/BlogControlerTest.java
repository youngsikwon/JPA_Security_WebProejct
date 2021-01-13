package com.cos.blog.test;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Spring이 패키지를 스캔해서 모든 파일을 메모리를 New 하는 것이 아니며, 특정 어느테이션이 붙어있는 클래스 파일을 New해서
            // (IOC) 스프링 컨테이너에 관리해줍니다.
public class BlogControlerTest {


    @GetMapping("/test/hello")
    public String hello(){
        return "<h1>hello spring boot</h1>";
    }

}
