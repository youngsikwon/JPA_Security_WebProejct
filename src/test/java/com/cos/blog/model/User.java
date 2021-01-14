package com.cos.blog.model;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity // User 테이블 생
public class User {

    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 프로젝트에서 연결된 DB의 넘버링 전략을 따라감.
    private int id; // auto_increment

    @Column(nullable = false,length = 30) //Null이 될 수 없다
    private String username; // 아이디

    @Column(nullable = false, length = 100) // 100으로 하는 이유는 ? 해쉬(비밀번호 암호화)
    private String password;

    @Column(nullable = false, length = 50)
    private String email;

    @ColumnDefault("'User'") // 문자을 알려주기 위해 ''ㅅ
    private String role; // 도메인 : 권한 설정

    @CreationTimestamp //자동입력(시간)
    private Timestamp createDate;

}
