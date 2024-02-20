package com.example.Todo.controller;

import com.example.Todo.model.ToDo;
import com.example.Todo.services.ToDoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class ToDoController {
    @Autowired
  private ToDoServices toDoServices;
    @PostMapping
    public ToDo createTask(@RequestBody ToDo toDo){
        return toDoServices.create(toDo);
    }
    @GetMapping
    public List<ToDo> getList(){
        return   toDoServices.getList();
    }
}
