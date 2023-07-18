package com.example.assignment.member.domain.response;

import com.example.assignment.member.domain.entity.Member;
import com.example.assignment.member.dto.MemberDto;
import com.example.assignment.todos.domain.entity.Todo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MemberResponse {
    private MemberDto member;
    private List<Todo> todos;
//    private List<> contents = new ArrayList();


    public MemberResponse(Member member) {
    }


}

