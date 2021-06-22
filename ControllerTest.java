package com.example.prices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;

class ControllerTest {

	private Controller controller;
	Date dNow = new Date( );
    
	@Test
	void test1() {
		controller = new Controller();
		String data = controller.getData(dNow, 35455L, 1L);
		assertEquals(data, controller.getData(dNow, 35455L, 1L));
	}
}
