package com.grupo7.madr.config;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.restassured.RestAssured;
import io.restassured.config.LogConfig;
import org.springframework.boot.test.web.server.LocalServerPort;

public class CucumberHooks {

	@LocalServerPort
	int randomServerPort;

	@BeforeAll()
	public static void beforeEach() throws Exception {
		RestAssured.config().logConfig(LogConfig.logConfig().enableLoggingOfRequestAndResponseIfValidationFails());
	}

	@Before
	public void setTestServerPort() {
		RestAssured.port = randomServerPort;
	}

}
