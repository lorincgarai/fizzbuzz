package com.garailorinc.sprintform.fizzbuzzproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.stream.Collectors;

@RestController
public class FizzBuzzController
{
    private FizzBuzzGenerator fizzBuzzGenerator;

    @RequestMapping(path = "/getfizzbuzz", method = RequestMethod.GET)
    public String getFizzBuzz()
    {
        return String.join("<BR>", new FizzBuzzGenerator().generateFizzBuzz(100));
    }
//new ResponseEntity<List<String>>
}
