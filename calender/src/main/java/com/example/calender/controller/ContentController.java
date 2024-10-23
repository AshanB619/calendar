package com.example.calender.controller;

import com.example.calender.model.Status;
import com.example.calender.model.content;
import com.example.calender.repository.contentcollectionrepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Optional<content> findById(@PathVariable Integer id){
        return repository.findById(id);
    }

}
