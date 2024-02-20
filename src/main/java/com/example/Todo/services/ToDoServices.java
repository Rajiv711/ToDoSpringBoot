package com.example.Todo.services;

import com.example.Todo.model.ToDo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoServices implements TodoService {
    private List<ToDo> list=new ArrayList<>();
    @Override
    public ToDo create(ToDo toDo) {
        list.add(toDo);
        return toDo;
    }

    @Override
    public List<ToDo> getList() {
        return list;
    }

}
