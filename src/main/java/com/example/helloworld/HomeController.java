package com.example.helloworld;

import com.mysql.cj.jdbc.JdbcConnection;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Connection;

@Controller
public class HomeController {

    public String name= "anna";

    @GetMapping("/")
    public String home(){

        return "index";
    }

    public void doSomething(){
            name = "anna changed";
    }

}
