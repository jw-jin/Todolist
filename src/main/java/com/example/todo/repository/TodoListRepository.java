package com.example.todo.repository;

import com.example.todo.domain.Todo;

import java.util.List;

public interface TodoListRepository {

    Todo saveTodoList(Todo todo);
    List<Todo> getTodoList();
    void updateById(Long Id, String Context);
    void deleteById(Long Id);

}
