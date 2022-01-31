package com.garailorinc.sprintform.fizzbuzzproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class FizzbuzzprojectApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void FizzBuzzGeneratesCorrectly()
	{
		List<String> actualFizzesBuzzes = new FizzBuzzGenerator().generateFizzBuzz(15);
		List<String> expectedFizzesBuzzes = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
		Assert.isTrue(actualFizzesBuzzes.equals(expectedFizzesBuzzes));
	}

}
