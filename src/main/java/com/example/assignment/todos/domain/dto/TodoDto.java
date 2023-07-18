package com.example.assignment.todos.domain.dto;

import com.example.assignment.todos.domain.entity.Todo;
import lombok.Getter;

@Getter
public class TodoDto {
    private Long id;
    private String title;
    private String content;
    private Boolean isDone;
    private Integer likeCount;

    public TodoDto(Todo todo) {
        this.id = todo.getId();
        this.title = todo.getTitle();
        this.content = todo.getContent();
        this.isDone = todo.getIsDone();
        this.likeCount = todo.getLikeContent();
    }
}
