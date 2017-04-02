package task7.module_7_2.sorts;

import java.util.Comparator;

import task7.module_7_1.Order;

public class SortPriceCity implements Comparator<Order>{

	@Override
	public int compare(Order o1, Order o2) {
		int compare = Integer.compare(o1.getPrice(), o2.getPrice());
		if( 0 == compare){
			compare = o1.getUser().getCity().compareTo(o2.getUser().getCity());
		}
		return compare;
	}

}
