package ua.lviv.iot.my_project.bank;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestRemovedNumber {
	
	private RemoveBankNumber removeBankNumber;
	
	@BeforeEach
	void setUp() throws Exception {
		removeBankNumber = new RemoveBankNumber();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testRemoving() {
		 String text = "1111 1111 1111 1111,1111567878965247,1111174128961234,2222562459877896,2222789652134512,7575123412341234";
		 String expected = "deleted,deleted,deleted,2222562459877896,2222789652134512,7575123412341234";
		Assertions.assertEquals(expected, removeBankNumber.removeNumber(text, "1111"));
	}

}
