package com.example.assignment.member.dto;

import com.example.assignment.member.domain.entity.Member;

public class MemberDto {
    private Long id;
    private String name;
    private Integer age;

    public MemberDto(Member member) {
        this.id = member.getId();
        this.name = member.getName();
        this.age = member.getAge();
    }
}
