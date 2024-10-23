package com.example.calender.repository;

import com.example.calender.model.Status;
import com.example.calender.model.content;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class contentcollectionrepository {
    private final List<content> Contentlist =new ArrayList<>();

    public contentcollectionrepository() {

    }

    public List<content> findAll() {
        return Contentlist;
    }

    public Optional<content> findById(int id) {
        return Contentlist.stream().filter(c -> c.id().equals(id)).findFirst();
    }



    public void save(content content) {
         Contentlist.add(content);
    }

    @PostConstruct
    public void init(){
        content content=new content(1,"ashan","hello", Status.IDEA, LocalDateTime.now(),"");
        Contentlist.add(content);

    }


}
