package task7.module_7_2.sorts;

import java.util.Comparator;

import task7.module_7_1.Order;

public class PriceDescendingSort implements Comparator<Order>{

	@Override
	public int compare(Order o1, Order o2) {
		Integer price1 = o1.getPrice();
		Integer price2 = o2.getPrice();
		return -price1.compareTo(price2);
	}

}
