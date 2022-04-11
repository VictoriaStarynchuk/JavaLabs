package labs_uni.lab_3_childshop.manager;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import labs_uni.lab_3_childshop.model.*;

public class ShopManager {

	private Map<String, List<ChildShopGoods>> goodsMap = new HashMap<>();

	public void addGoods(List<ChildShopGoods> goods) {
		goods.forEach(good -> {
			String category = good.getCategory();
			var existingGoods = goodsMap.get(category);
			if (existingGoods == null) {
				existingGoods = new LinkedList<ChildShopGoods>();
				goodsMap.put(category, existingGoods);
			}
			existingGoods.add(good);
		});
	}

	public ArrayList<ChildShopGoods> findGoodsByAge(AgeCategory ageCategory) {
		ArrayList<ChildShopGoods> goodsSameAge = new ArrayList<ChildShopGoods>();
		for (List<ChildShopGoods> goods : goodsMap.values()) {
			for (ChildShopGoods good : goods) {
				if (good.getAgeCategory().equals(ageCategory)) {
					goodsSameAge.add(good);
				}
			}
		}
		return goodsSameAge;
	}
	
	public void  sortByPriceAscending(List<ChildShopGoods> goods){
		goods.sort(ascendingsortByPrice);
	}


	
	public static Comparator<ChildShopGoods> ascendingsortByPrice = new Comparator<ChildShopGoods>() {
		public int compare(ChildShopGoods good1, ChildShopGoods good2) {
			int GoodPrice1 = good1.getPrice();
			int GoodPrice2 = good2.getPrice();

			return GoodPrice1 - GoodPrice2;
		}
	};
	
	public void  sortByPriceDescending(List<ChildShopGoods> goods){
		goods.sort(descendingsortByPrice);
	}
	
	public static Comparator<ChildShopGoods> descendingsortByPrice = new Comparator<ChildShopGoods>() {
		public int compare(ChildShopGoods good1, ChildShopGoods good2) {
			int GoodPrice1 = good1.getPrice();
			int GoodPrice2 = good2.getPrice();

			return GoodPrice2 - GoodPrice1;
		}
	};

	
	public void  sortByNameAscending(List<ChildShopGoods> goods){
		goods.sort(ascendingsortByName);
	}
	
	public static Comparator<ChildShopGoods> ascendingsortByName = new Comparator<ChildShopGoods>() {
		public int compare(ChildShopGoods good1, ChildShopGoods good2) {
			String GoodName1 = good1.getNameOfProduct().toUpperCase();
			String GoodName2 = good2.getNameOfProduct().toUpperCase();

			return GoodName1.compareTo(GoodName2);
		}
	};
	
	public void  sortByNameDescending(List<ChildShopGoods> goods){
		goods.sort(descendingsortByName);
	}

	public static Comparator<ChildShopGoods> descendingsortByName = new Comparator<ChildShopGoods>() {
		public int compare(ChildShopGoods good1, ChildShopGoods good2) {
			String GoodName1 = good1.getNameOfProduct().toUpperCase();
			String GoodName2 = good2.getNameOfProduct().toUpperCase();

			return GoodName2.compareTo(GoodName1);
		}
	};

};
