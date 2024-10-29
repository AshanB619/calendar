package com.example.calender.model;

import jakarta.validation.constraints.NotBlank;
import jdk.jshell.Snippet;
import org.springframework.data.annotation.Id;

import java.lang.reflect.Type;
import java.net.Proxy;
import java.time.LocalDateTime;

public record content(
        @Id
        Integer id,
        @NotBlank
        String title,
        String desc,
        Status status,
        LocalDateTime datecreated,
        String url


)
{



}
