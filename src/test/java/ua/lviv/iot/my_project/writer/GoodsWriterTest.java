package ua.lviv.iot.my_project.writer;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.my_project.manager.ShopManager;
import ua.lviv.iot.my_project.model.AgeCategory;
import ua.lviv.iot.my_project.model.BathAndBodyCare;
import ua.lviv.iot.my_project.model.ChildShopGoods;
import ua.lviv.iot.my_project.model.Clothes;
import ua.lviv.iot.my_project.model.ClothesType;
import ua.lviv.iot.my_project.model.FeedingCare;
import ua.lviv.iot.my_project.model.Gender;
import ua.lviv.iot.my_project.model.PackSize;
 

class GoodsWriterTest {
	
	List<ChildShopGoods> goods;
	ShopManager shopManager = new ShopManager();
	
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
		GoodsWriter.writeToFile(goods, "expected");
	}
	
	@Test
	void testWriteToFile() throws IOException {
	    try (
	        FileReader expectedReader = new FileReader(new File(
	            Paths.get("").toAbsolutePath().toString() + "\\src\\test\\resources", "expected.csv"));
	        BufferedReader expectedBR = new BufferedReader(expectedReader);
	        FileReader actualReader = new FileReader(new File(
	            Paths.get("").toAbsolutePath().toString() + "\\src\\test\\resources", "GoodsWriter.csv"));
	        BufferedReader actualBR = new BufferedReader(actualReader)) {
	      String line = "";
	      while ((line = expectedBR.readLine()) != null) {
	        assertEquals(line, actualBR.readLine());
	      }
	    }
	  }
	
	
	
}
