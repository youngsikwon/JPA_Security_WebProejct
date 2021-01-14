package com.cos.blog.test;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TempContrlloerTest {


    // http://localhost:8000/blog/temp/homexw
    @GetMapping("/temp/home")
    public String tempHome(){
        System.out.println("temphomeTest()");
        //파일리턴 기본 경로 : src/main/resources/satic
        //리턴명 : /home.html
        // 풀경로 : src/main/reousrce/static/static/home.html
        return "/home.html";
    }

    @GetMapping("/temp/jsp")
    public String tempJsp(){

        return "test";
    }
}
