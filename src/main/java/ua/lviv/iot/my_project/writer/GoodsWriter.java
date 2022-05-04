package ua.lviv.iot.my_project.writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import ua.lviv.iot.my_project.manager.ShopManager;
import ua.lviv.iot.my_project.model.ChildShopGoods;

public class GoodsWriter extends ShopManager {

	public static void writeToFile(List<ChildShopGoods> goods, String fileName) {
		File file = new File(fileName + ".csv");

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write(goods.get(0).getHeaders() + "\n");
			for (ChildShopGoods good : goods) {
				writer.write(good.toCSV() + "\n");

			}
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

