package com.example.board.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LogAdvice {
    @Before("@@annotation(com.example.)")
    public void beforeStart() {

    }
}
