package com.SpringbootJdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class Controller {
    @Autowired
    Demo demo;
    @GetMapping(value="/name")

    public String Bookname()
    {
        return "Bookname";
    }
    @GetMapping(value="/Booknames")
    public List<String> Booknames(){
        return demo.Bookname();
    }
    @PostMapping(value="/login")
    public String Login(@RequestBody Login login){
        System.out.println(login.username);
        System.out.println(login.password);
        return "login is done";
    }
}

