package com.cos.blog.test;

import com.cos.blog.model.RoleType;
import com.cos.blog.model.User;
import com.cos.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.function.Supplier;

@RestController
public class DummyControllerTest {

    @Autowired //
    private UserRepository userRepository;


    @GetMapping("/dummy/users")
    public List<User> list(){
        return userRepository.findAll();
    }

    // page 1 or 2page to return
    @GetMapping("dummy/user")
    public List<User> pageList(@PageableDefault(size = 2, sort = "id", direction = Sort.Direction.DESC) Pageable pageable){

        Page<User> pagingUser = userRepository.findAll(pageable);
        List<User> users = pagingUser.getContent();

        return users;
    }



    // http://localhost:8000/blog.dummy/user/3
    @GetMapping("/dummy/user/{id}")
    public User detail(@PathVariable int id){

        //람다식
//    User user = userRepository.findById(id).orElseThrow(()-> {
//       return new IllegalArgumentException("해당 사용자는 없습니다.");
//    });

        User user = userRepository.findById(id).orElseThrow(new Supplier<IllegalArgumentException>() {
            @Override
            public IllegalArgumentException get() {
                return new IllegalArgumentException("해당 유저가 없습니다.");
            }
        });

        return user;
    }

    // http://localhost:8000/blog/dummy/join
    @PostMapping("/dummy/join")
    public String join(User user){
        System.out.println("username :" + user.getUsername());
        System.out.println("pawword :" + user.getPassword());
        System.out.println("Email :" + user.getEmail());
        System.out.println("role :" + user.getRole());
        System.out.println("createDate :" + user.getCreateDate());


        user.setRole(RoleType.USER);
        userRepository.save(user);
        return "회원가입이 완료되었습니다.";

    }
}
