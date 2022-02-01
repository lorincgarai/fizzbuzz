package com.garailorinc.sprintform.fizzbuzzproject;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class FizzBuzzController
{
    @RequestMapping(path = "/getfizzbuzz", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> getFizzBuzz()
    {
        return new ResponseEntity<>(FizzBuzzGenerator.generateFizzBuzz(100), HttpStatus.OK);
    }
}
