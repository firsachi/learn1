package task7.module_7_3;

import java.util.function.Predicate;

import task7.module_7_1.Order;

public class FiltrName implements Predicate<Order>{

	@Override
	public boolean test(Order t) {
		return t.getUser().getLastName().equals("Petrov");
	}

}
