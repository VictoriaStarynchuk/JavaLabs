package ua.lviv.iot.my_project.manager;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.LinkedList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.my_project.model.*;

class ShopManagerTest {
	private ShopManager shopManager = new ShopManager();
	private List<ChildShopGoods> goods;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		goods = new LinkedList<ChildShopGoods>();
		goods.add(new Clothes("Clothes", "TSirts colorful", AgeCategory.ONETOFOURMONTH, "Zara", 399, Gender.Girls,
				ClothesType.TShirt, "pink"));
		goods.add(new Clothes("Clothes", "Gloves for winter", AgeCategory.FOURWEEKS, "Mango", 200, Gender.UniSex,
				ClothesType.Gloves, "grey"));
		goods.add(new Clothes("Clothes", "BodySuit monotonne", AgeCategory.NINETOTWELFTHMONTH, "Teddy", 659,
				Gender.Boys, ClothesType.BodySuit, "blue"));
		goods.add(new BathAndBodyCare("Bath And Body Care", "Shampoo", AgeCategory.NINETOTWELFTHMONTH, "Bioderma", 89,
				Gender.UniSex, PackSize.Small));
		goods.add(new FeedingCare("Feeding Care ", "Oats Cereal", AgeCategory.FIVETOEIGHTMONTH, "Milupa", 78,
				Gender.UniSex, "pumpkin, dry milk, no sugar", "25/06/2023"));
		shopManager.addGoods(goods);
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testFindGoodsByAge() {
		assertEquals("Gloves for winter", shopManager.findGoodsByAge(AgeCategory.FOURWEEKS).get(0).getNameOfProduct());
		assertEquals("Bioderma", shopManager.findGoodsByAge(AgeCategory.NINETOTWELFTHMONTH).get(0).getBrand());
		assertEquals("Teddy", shopManager.findGoodsByAge(AgeCategory.NINETOTWELFTHMONTH).get(1).getBrand());
		assertEquals("Zara", shopManager.findGoodsByAge(AgeCategory.ONETOFOURMONTH).get(0).getBrand());
	}

	@Test
	void testSortGoodsByPriceAsc() {
	    shopManager.sortByPriceAscending(goods);
		assertEquals(78, goods.get(0).getPrice());
		assertEquals(89, goods.get(1).getPrice());
		assertEquals(200, goods.get(2).getPrice());
		assertEquals(399, goods.get(3).getPrice());
		assertEquals(659, goods.get(4).getPrice());
	}

	@Test
	void testSortGoodsByPriceDsc() {
		shopManager.sortByPriceDescending(goods);
		assertEquals(78, goods.get(4).getPrice());
		assertEquals(89, goods.get(3).getPrice());
		assertEquals(200, goods.get(2).getPrice());
		assertEquals(399, goods.get(1).getPrice());
		assertEquals(659, goods.get(0).getPrice());
	}

	@Test
	void testSortGoodsByNameAsc() {
		shopManager.sortByNameAscending(goods);
		assertEquals("BodySuit monotonne", goods.get(0).getNameOfProduct());
		assertEquals("Gloves for winter", goods.get(1).getNameOfProduct());
		assertEquals("Oats Cereal", goods.get(2).getNameOfProduct());
		assertEquals("Shampoo", goods.get(3).getNameOfProduct());
		assertEquals("TSirts colorful", goods.get(4).getNameOfProduct());
	}

	@Test
	void testSortGoodsByNameDsc() {
		shopManager.sortByNameDescending(goods);
		assertEquals("BodySuit monotonne", goods.get(4).getNameOfProduct());
		assertEquals("Gloves for winter", goods.get(3).getNameOfProduct());
		assertEquals("Oats Cereal", goods.get(2).getNameOfProduct());
		assertEquals("Shampoo", goods.get(1).getNameOfProduct());
		assertEquals("TSirts colorful", goods.get(0).getNameOfProduct());
	}

}
