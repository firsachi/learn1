package task7.module_7_3;

import java.util.function.Predicate;

import task4.module4_1.Currency;
import task7.module_7_1.Order;

public class FilterRemoveCurrensy implements Predicate<Order>{

	private Currency currensy;
	
	public FilterRemoveCurrensy(Currency currensy) {
		this.currensy = currensy;
	}

	@Override
	public boolean test(Order t) {
		return t.getCurrency().equals(currensy);
	}

}
