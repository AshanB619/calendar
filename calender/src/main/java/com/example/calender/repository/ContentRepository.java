package com.example.calender.repository;

import com.example.calender.model.content;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

public interface ContentRepository extends ListCrudRepository<content,Integer> {

}
