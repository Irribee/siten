package com.learningSpring;

import org.springframework.boot.autoconfigure.context.MessageSourceProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController//это программный модуль, который слушает запросы и возвращает какие то данные
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(
           @RequestParam(name = "name", required = false, defaultValue = "World") String name,
          HashMap <String, Object> model
    ) {//куда будем скалдывать данные, которые хотим вернуть пользователю
        model.put("name", name);
        return "hello "+name;//возвращ имя файла, которое хотим отобразить
    }
@GetMapping
    public String main( HashMap <String, Object> model){
        model.put("some", "hello world");
        return "hello World";
}
}