package com.cos.blog.model;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

public class Board {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// auto_increament
    private int id;

    @Column(nullable = false, length = 100)
    private String title;

    @Lob // 대용 데이터
    private String content; //섬머노트 라이브<html>태그 섞인 라이

    @ColumnDefault("0")
    private int count;

    @ManyToOne // Many = board & User = One
    @JoinColumn(name = "userId")
    private User user; //DB -> Object 저장X (FX, Java는 저장 가능)

    @CreationTimestamp
    private Timestamp createDate;
}
