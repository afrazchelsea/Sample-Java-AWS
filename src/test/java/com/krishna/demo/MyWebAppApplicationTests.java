package com.krishna.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.servlet.ModelAndView;

@SpringBootTest
class MyWebAppApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testHomeController() {
		HomeController homeController = new HomeController();
		String result = homeController.home1();
		assertEquals(result, "home1");;
	}

}
