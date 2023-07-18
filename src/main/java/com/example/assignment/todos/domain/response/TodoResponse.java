package com.example.assignment.todos.domain.response;

import com.example.assignment.member.dto.MemberDto;
import com.example.assignment.todos.domain.entity.Todo;

public class TodoResponse {
    private Long id;
    private String title;
    private String content;
    private Boolean isDone;
    private Integer likeContent;
    private MemberDto member;

    public TodoResponse(Todo todo) {
        this.id = todo.getId();
        this.title = todo.getTitle();
        this.content = todo.getContent();
        this.isDone = todo.getIsDone();
        this.likeContent = todo.getLikeContent();
        this.member = new MemberDto(todo.getMember());
    }
}
