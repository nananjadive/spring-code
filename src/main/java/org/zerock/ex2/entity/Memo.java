package org.zerock.ex2.entity;

import lombok.*;

import javax.persistence.*;

@Entity // java 코드를 디비로 만들어주는 어노테이션.
@Table(name= "tbl_memo")
@ToString
@Getter
public class Memo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoIncrement
    private Long mno;

    @Column(name = "conent",nullable = false,length = 45,insertable = false,updatable = false)
    private String content;

    public Memo(Long mno, String content) {
        this.mno = mno;
        this.content = content;
    }
}
