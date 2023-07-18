package com.example.assignment.todos.service;

import com.example.assignment.todos.domain.entity.Todo;
import com.example.assignment.todos.domain.request.TodosRequest;
import com.example.assignment.todos.domain.response.TodoResponse;
import com.example.assignment.todos.repository.TodosRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional
public class TodosService {
    private final TodosRepository todosRepository;

    public void todosSave(TodosRequest request) {
        Todo todosSave = todosRepository.save(request.toEntity());
        log.info("SAVED ID: {}, SAVED TITLE : {}, SAVED CONTENT : {}, SAVED ISDONE : {}," +
                        "LIKECONTENT : {}",
                todosSave.getId(), todosSave.getTitle(), todosSave.getContent(), false,
                todosSave.getLikeContent());
    }
    public Page<TodoResponse> findAll(PageRequest request) {
        Page<Todo> all = todosRepository.findAll(request);
        return all.map(TodoResponse::new);
    }

}
