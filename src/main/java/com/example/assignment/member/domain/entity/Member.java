package com.example.assignment.member.domain.entity;

import com.example.assignment.todos.domain.entity.Todo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "members")
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private Integer password;
    private String name;
    private int age;


    @OneToMany(mappedBy = "member")
    private List<Todo> todos = new ArrayList<>();

}
