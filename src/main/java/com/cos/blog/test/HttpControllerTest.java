package com.cos.blog.test;


import org.springframework.web.bind.annotation.*;

// 사용자가 요청 -> 응답(html파일)
//@Controller

//사용자가 요청 -> 응답(데이터)
@RestController
public class HttpControllerTest {

    private static final String TAG = "HttpControllerTest ";

    @GetMapping("/blog/http/lombok")
    public String lombokTest(){
        Member m = new Member(1, "Sal", "1234", "email");
        System.out.println(TAG+"getter :" + m.getId());
        m.setId(5000);
        System.out.println(TAG+"setter :" + m.getId());

        return "lombok Test 완료";

    }

    // http://localhost:8080/http/get select
    @GetMapping("/http/get")
    public String getTest(Member m) {


        return "get 요청" + m.getId() + " ," + m.getUsername() + m.getEmail() + m.getPassword();
    }

    // http://localhost:8080/http/post insert
    @PostMapping("/http/post")
    public String postTest() {
        return "post 요청";
    }

    // http://localhost:8080/http/put updat
    @PutMapping("/http/put")
    public String putTest() {
        return "put 요청";
    }

    // http://localhost:8080/http/delete delete
    @DeleteMapping("/http/delete")
    public String deleteTest() {
        return "delete 요청";
    }

}
