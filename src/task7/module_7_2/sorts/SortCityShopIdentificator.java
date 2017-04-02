package task7.module_7_2.sorts;

import java.util.Comparator;

import task7.module_7_1.Order;

public class SortCityShopIdentificator implements Comparator<Order>{

	@Override
	public int compare(Order o1, Order o2) {
		int compare = o1.getItemName().compareTo(o2.getItemName());
		if(0 == compare){
			if (0 == o1.getShopIdentificator().compareTo(o2.getShopIdentificator())){
				compare = o1.getUser().getCity().compareTo(o2.getUser().getCity());
			}
		}else {
			compare = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
		}
		return compare;
	}

}
