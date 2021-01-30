package com.cos.blog.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment
    private int id;

    @Column(nullable = false, length = 30, unique = true) // unique : 중복 x
    private String username;

    @Column(nullable = false, length = 1000) // hash 값으로 인해 length가 높아야 함.
    private String password;

    @Column(nullable = false, length = 50)
    private String email;

//    @ColumnDefault("user")
    @Enumerated(EnumType.STRING)
    private RoleType role; // 회원 권한, ADMIN, USER

    @CreationTimestamp
    private Timestamp createDate;

}
