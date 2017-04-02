package task7;

import java.util.List;

import task7.module_7_1.Order;

public class View {

	public void print(String str){
		System.out.println(str);
	}
	
	public void print(List<Order> list){
		String str = "id = %-5o itemName = %-25s shopIdentificator = %-15s price = %-15d city = %s";
		System.out.println("\n");
		for (Order value: list){
			print(String.format(str, value.getId(), value.getItemName(), value.getShopIdentificator(), value.getPrice(), value.getUser().getCity()));
		}
	}
}
