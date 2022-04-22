package ua.lviv.iot.my_project.manager;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.my_project.model.AgeCategory;
import ua.lviv.iot.my_project.model.Clothes;
import ua.lviv.iot.my_project.model.ClothesType;
import ua.lviv.iot.my_project.model.Gender;

class TestClothes {

	private Clothes clothes;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		clothes =  new Clothes("Clothes", "TSirts colorful", AgeCategory.ONETOFOURMONTH, "Zara", 399, Gender.Girls, ClothesType.TShirt, "pink");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testClothesConstructor() {
		assertEquals("Clothes", clothes.getCategory());
		assertEquals("TSirts colorful", clothes.getNameOfProduct());
		assertEquals(AgeCategory.ONETOFOURMONTH, clothes.getAgeCategory());
		assertEquals("Zara", clothes.getBrand());
		assertEquals(399, clothes.getPrice());
		assertEquals(Gender.Girls, clothes.getWhatGender());
		assertEquals(ClothesType.TShirt, clothes.getClothesType());
		assertEquals("pink", clothes.getClothesColour());
	}

}
