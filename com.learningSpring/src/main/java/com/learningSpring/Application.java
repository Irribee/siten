package com.learningSpring;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//апускает все приложение
@SpringBootApplication //аннотация, которая добавляет спец подвесы, которрая все подниме
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

}
//http://localhost:8080/greeting?name=Irina