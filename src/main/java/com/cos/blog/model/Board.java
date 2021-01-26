package com.cos.blog.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Board {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment
    private int id;

    @Column(nullable = false, length = 100)
    private String title;


    @Lob
    private String content;

    private int count;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId")
    private User user;

    //데이터에 들어가진 않음 // select 하기 위한 코드
    @OneToMany(mappedBy = "board", fetch = FetchType.EAGER)// mappedBy 연관관계의 주인이 아님(FK가 아님)
    private List<Reply> reply;


    @CreationTimestamp
    private Timestamp createDate;

}
