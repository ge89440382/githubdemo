package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "spring")
public class SpringHello {

    @Autowired
    private Person person;

    @GetMapping(value = "/say/{id}")
    public String sayHello(@PathVariable("id")int id){
        return  person.getName()+"-"+person.getSex()+"-"+person.getAge()+"-"+id;

    }


}
