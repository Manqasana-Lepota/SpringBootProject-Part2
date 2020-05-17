package com.springboot;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringBootFinalProjectPart2ApplicationTests {

	@Autowired
	private TestRestTemplate template;


	@Test
	public void givenAuthRequest() throws Exception {
		ResponseEntity<String> result = template.withBasicAuth("user", "user123")
				.getForEntity("/user/", String.class);
		assertEquals(HttpStatus.OK, result.getStatusCode());
		System.out.println(result);


	}
}
