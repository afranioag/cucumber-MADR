package com.grupo7.madr.config;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureTestDatabase
@CucumberContextConfiguration
@ActiveProfiles("test")
public class CucumberSpringConfiguration {

}
