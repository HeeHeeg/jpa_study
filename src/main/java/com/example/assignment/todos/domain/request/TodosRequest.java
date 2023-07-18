package com.example.assignment.todos.domain.request;

import com.example.assignment.todos.domain.entity.Todo;
import lombok.Getter;

@Getter
public class TodosRequest {
    private String title;
    private String content;
    private Boolean isDone;
    private Integer likeContent;
    private Long memberId;


    public TodosRequest(String title, String content, Boolean isDone, Integer likeContent, Long memberId) {
        this.title = title;
        this.content = content;
        this.isDone = false;
        this.likeContent = likeContent;
        this.memberId = memberId;
    }

    public Todo toEntity() {
        return Todo
                .builder()
                .title(title)
                .content(content)
                .likeContent(likeContent)
                .isDone(isDone)
                .build();
    }
}
