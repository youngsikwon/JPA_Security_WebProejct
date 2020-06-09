package com.cos.blog.test;import org.springframework.web.bind.annotation.*;//사용자 요청 -> 응답(HTML)//@Controller// 사용자 요청 -> 응답(Data)@RestControllerpublic class HttpControllerTest {   private static final String TAG = "HttpControllerTest";   //인터넷 브라우저 요청은 무조건 get요청밖에 할 수 없다.   // http://localhost:8080/http/get (SELECT)   @GetMapping("/http/get")   public String getTest(Member m) {// id=1&username=영식&password=1234&&email=youngsik3200@gmail.com      System.out.println(TAG+"Getter" + m.getId());      System.out.println(TAG+"Getter" + m.setId(5000));      return "get request : " + m.getId() + m.getUsername()+ m.getPassword()+ m.getEmail() ;   }   // http://localhost:8080/http/post (INSERT)   @PostMapping("/http/post") // text/plain, apppation/JSON   public String postTest(@RequestBody Member m) {// MesseageConverter (Spring boot)      return "Post Request :" + m.getId() + m.getUsername()+ m.getPassword()+ m.getEmail();   }   // http://localhost:8080/http/put (UPDATE)   @PutMapping("/http/put")   public String putTest(@RequestBody Member m) {      return "Put Request : " + m.getId() + m.getUsername()+ m.getPassword()+ m.getEmail();   }   // http://localhost:8080/http/delete (DELETE)   @DeleteMapping("/http/delete")   public String deleteTest() {      return "DELETE Request : ";   }}