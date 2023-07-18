package com.example.assignment.todos.controller;

import com.example.assignment.todos.domain.request.TodosRequest;
import com.example.assignment.todos.domain.response.TodoResponse;
import com.example.assignment.todos.service.TodosService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/todos")
public class TodosController {
    private final TodosService todosService;

    @PostMapping
    public void todosSave(@RequestBody TodosRequest request) {
        todosService.todosSave(request);
    }

    @GetMapping
    public Page<TodoResponse> findAll(@RequestParam(name = "size",required = false, defaultValue = "10") Integer size,
                                      @RequestParam(name = "page",required = false, defaultValue = "0") Integer page) {
        PageRequest request = PageRequest.of(page, size);
        return todosService.findAll(request);
    }
}
