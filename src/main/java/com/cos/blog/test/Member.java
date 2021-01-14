package com.cos.blog.test;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//
//@Getter
//@Setter
@Data // 게터, 세터 생성 할 수 있음.
//@AllArgsConstructor // 모든 생성자를 만들 수 있음.
//@RequiredArgsConstructor // final에 붙은 애들한테 Constructor 해줌.
@NoArgsConstructor // 빈생성
public class Member {


    @Builder
    public Member(int id, String username, String password, String email) {
        this.id = id;
        Username = username;
        this.password = password;
        this.email = email;
    }

    private int id;
    private String Username;
    private String password;
    private String email;


}
