package com.example.demo_spring_boot_application.controller;

import com.example.demo_spring_boot_application.model.Person;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PersonController {
    ArrayList<Person> personArrayList=new ArrayList<>();

    @RequestMapping(value ="/add_per_new", method = RequestMethod.POST)
    public String addEmployee(@RequestBody Person person){

        personArrayList.add(person);
        return "Person Added Successfully....";
    }


    @RequestMapping(value = "/get_all_per_new" , method = RequestMethod.GET)
    public ArrayList<Person> getPersonArrayList(){

        return personArrayList;
    }
}
