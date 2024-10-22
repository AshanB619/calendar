package com.example.calender.controller;

import com.example.calender.model.Status;
import com.example.calender.model.content;
import com.example.calender.repository.contentcollectionrepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.AbstractDocument;
import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.util.List;

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

}
