package com.example.assignment.member.domain.request;

import com.example.assignment.member.domain.entity.Member;
import lombok.Getter;

@Getter
public class MemberRequest {
    private String name;
    private int age;
    private int password;
    private String email;

    public MemberRequest(String name, int age, int password, String email) {
        this.name = name;
        this.age = age;
        this.password = password;
        this.email = email;

    }

    public Member toEntity() {
        return Member
                .builder()
                .name(name)
                .age(age)
                .password(password)
                .email(email)
                .build();
    }
}
