package com.example.Todo.services;

import com.example.Todo.model.ToDo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TodoService {
    public ToDo create(ToDo toDo);
    public List<ToDo> getList();
}
