package com.BB2FormacionJacinto;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = Runner.class)
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:application-integrationtest.properties")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS) //This annotation is necessary if @BeforeAll and @AfterAll are used in non static methods
@ActiveProfiles(value = "test") //Activates the test profile when this class is going to run
class Bb2FormacionJacintoApplicationTests {

	@Test
	void contextLoads() {
	}

	//This method is called only once before all test methods
	@BeforeAll
	public void beforeAll(){
		System.out.println("FIRST CALL BEFORE ALL TEST EXECUTION");
	}

	//This method is called only once after all test methods
	@AfterAll
	public void afterAll(){
		System.out.println("LAST CALL AFTER ALL TEST EXECUTION");
	}

}
