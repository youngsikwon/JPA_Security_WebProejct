package com.cos.blog.handler;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RestController
public class GlobalExcetionHandler {

    @ExceptionHandler(value = IllegalArgumentException.class)
    public String handlerArgumentExcetion(IllegalArgumentException e){
        return "<h1>" + e.getMessage()+ "/<h1>";
    }
}
