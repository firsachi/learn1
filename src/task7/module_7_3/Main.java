package task7.module_7_3;

import java.util.ArrayList;
import java.util.Set;

import task4.module4_1.Currency;
import task7.module_7_1.Order;
import task7.module_7_2.FillList;

public class Main {

	public static void main(String[] args) {
		
		Set<Order> setOrder = new FillList().getSetOrder();
		System.out.println(UtilsOrder.filter(setOrder, new FiltrName()));
		System.out.println(new ArrayList<>(setOrder).get(setOrder.size() -1 ));
		System.out.println(UtilsOrder.removeIterator(setOrder, new FilterRemoveCurrensy(Currency.USD)));
	}
}
