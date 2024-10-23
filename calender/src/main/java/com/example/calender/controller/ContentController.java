package com.example.calender.controller;

import com.example.calender.model.Status;
import com.example.calender.model.content;
import com.example.calender.repository.contentcollectionrepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.swing.text.AbstractDocument;
import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/content")
public class ContentController {
    private final contentcollectionrepository repository;

    public ContentController(contentcollectionrepository repository) {
        this.repository = repository;
    }
    @GetMapping("")
    public List<content>findAll(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public content findById(@PathVariable Integer id){
        return repository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"content not found"));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void create(@RequestBody content content){
        repository.save(content);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody content Content, @PathVariable Integer id){
        if (!repository.existByid(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"content not found");
        }
        repository.save(Content);
    }

}
