package com.example.calender.model;

import jakarta.validation.constraints.NotBlank;
import jdk.jshell.Snippet;

import java.lang.reflect.Type;
import java.net.Proxy;
import java.time.LocalDateTime;

public record content(
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
