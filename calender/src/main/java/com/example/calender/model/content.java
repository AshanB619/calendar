package com.example.calender.model;

import jdk.jshell.Snippet;

import java.lang.reflect.Type;
import java.net.Proxy;
import java.time.LocalDateTime;

public record content(
        Integer id,
        String title,
        String desc,
        Status status,
        Type contentType,
        LocalDateTime datecreated,
        LocalDateTime dateupdated,
        String url


)
{

}
