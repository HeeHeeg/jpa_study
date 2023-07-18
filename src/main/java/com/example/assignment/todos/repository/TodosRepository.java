package com.example.assignment.todos.repository;

import com.example.assignment.todos.domain.entity.Todo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodosRepository extends JpaRepository<Todo, Long> {
    Page<Todo> findAll(Pageable pageable);
}
