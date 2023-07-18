package com.example.assignment.member.domain.response;

import com.example.assignment.member.domain.entity.Member;
import lombok.Getter;

@Getter
public class LoginResponse {
    private Long id;
    private String name;
    private Integer age;

    public LoginResponse(Member member) {
        this.id = member.getId();
        this.name = member.getName();
        this.age = member.getAge();
    }

}
