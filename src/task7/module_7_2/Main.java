package task7.module_7_2;


import java.util.Collections;
import java.util.List;

import task7.FillList;
import task7.View;
import task7.module_7_1.Order;
import task7.module_7_2.sorts.PriceDescendingSort;
import task7.module_7_2.sorts.SortCityShopIdentificator;
import task7.module_7_2.sorts.SortPriceCity;

public class Main {
	
	public static void main(String[] args) {
		
		List<Order> listOrder = new FillList().getList();
		View view = new View();
		
		// sort list price descending
		Collections.sort(listOrder, new PriceDescendingSort());
		view.print(listOrder);
		
		//sort list price and city
		Collections.sort(listOrder, new SortPriceCity());
		view.print(listOrder);

		
		Collections.sort(listOrder, new SortCityShopIdentificator());
		view.print(listOrder);
	}
	
	
	
	

}
