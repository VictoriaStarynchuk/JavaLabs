package ua.lviv.iot.my_project.model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestFeedingCare {
	
	private FeedingCare iteam;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		iteam = new FeedingCare("Feeding Care", "Oats Cereal", AgeCategory.FIVETOEIGHTMONTH, "Milupa", 78, Gender.UniSex, "pumpkin, dry milk, no sugar", "25/06/2023");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testFeedingCareConstructor() {
		assertEquals("Feeding Care", iteam.getCategory());
		assertEquals("Oats Cereal", iteam.getNameOfProduct());
		assertEquals(AgeCategory.FIVETOEIGHTMONTH, iteam.getAgeCategory());
		assertEquals("Milupa", iteam.getBrand());
		assertEquals(78, iteam.getPrice());
		assertEquals(Gender.UniSex, iteam.getWhatGender());
		assertEquals("pumpkin, dry milk, no sugar", iteam.getAddsToFood());
		assertEquals("25/06/2023", iteam.getExpeirenceDate());
	}

//	@Test 
//	void testToString() {
//		String expected = "Category: Feeding Care, product: Oats Cereal, for age in month: FIVETOEIGHTMONTH, brand: Milupa, price: 78 UAH, gender: UniSex, food adding: pumpkin, dry milk, no sugar, expiry date: 25/06/2023.";
//		assertEquals(expected, iteam.toString());
//	}
	
}
