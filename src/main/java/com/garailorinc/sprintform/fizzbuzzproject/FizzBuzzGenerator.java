package com.garailorinc.sprintform.fizzbuzzproject;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzGenerator
{

    public FizzBuzzGenerator()
    {

    }
    public List<String> generateFizzBuzz(int bound)
    {
        List<String> lists = new ArrayList<>();
        for (int number = 1; number <= bound; number++)
        {
            if (number % 3 == 0 && number % 5 == 0)
            {
                lists.add("FizzBuzz");
            }
            else if (number % 5 == 0)
            {
                lists.add("Buzz");
            }
            else if (number % 3 == 0)
            {
                lists.add("Fizz");
            }
            else
            {
                lists.add(String.valueOf(number));
            }
        }
        return lists;
    }
}
