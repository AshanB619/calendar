package com.example.calender.repository;

import com.example.calender.model.content;
import org.springframework.stereotype.Repository;

import javax.swing.text.AbstractDocument;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class contentcollectionrepository {
    private final List<content> Content=new ArrayList<>();

    public contentcollectionrepository() {

    }

    public List<content> findAll() {
        return Content;
    }

    public Optional<content> findById(int id) {
        return Content.stream().filter(c -> c.id().equals(id)).findFirst();
    }
}
