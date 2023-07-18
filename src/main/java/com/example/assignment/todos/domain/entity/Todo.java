package com.example.assignment.todos.domain.entity;

import com.example.assignment.member.domain.entity.Member;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "todos")
public class Todo {
    @Id @GeneratedValue
    private Long id;
    private String title;
    private String content;
    private Boolean isDone;
    private Integer likeContent;

    @ManyToOne
    private Member member;


    public Todo(Long id, String title, String content, Integer likeContent) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.isDone = false;
        this.likeContent = likeContent;
    }
}
