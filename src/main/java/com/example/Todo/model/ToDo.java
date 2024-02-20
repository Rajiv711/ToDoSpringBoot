package com.example.Todo.model;


import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.data.annotation.Id;

//@Entity
public class ToDo {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String content;

    public ToDo(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public ToDo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
