package task7;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Locale;

import task7.module_7_1.Order;
import task7.module_7_1.User;

public class FillList {
	
	
	public List<Order> getList(){
		User user0 = new User(1, "Alex", "Vata", "Lviv", 200);
		User user1 = new User(1, "Alex", "Vata", "London", 200);
		User user2 = new User(1, "Alex", "Vata", "Kyev", 200);
		User user3 = new User(1, "Alex", "Vata", "Kyev", 200);
		User user4 = new User(1, "Alex", "Vata", "London", 200);
		User user5 = new User(1, "Alex", "Vata", "lviv", 200);
		User user6 = new User(1, "Alex", "Vata", "Dnepr", 200);
		User user7 = new User(1, "Alex", "Vata", "Moskva", 200);
		User user8 = new User(1, "Alex", "Vata", "Kyev", 200);
		User user9 = new User(1, "Alex", "Vata", "London", 200);
		List<Order> result = new ArrayList<>();
		result.add(new Order(1, 1000, Currency.getInstance(Locale.CANADA), "HP3027", "000f0198", user0));
		result.add(new Order(3, 15000, Currency.getInstance(Locale.CANADA), "PowerEdge", "000f0199", user1));
		result.add(new Order(31, 21000, Currency.getInstance(Locale.CANADA), "Car", "100f0198", user2));
		result.add(new Order(12, 31000000, Currency.getInstance(Locale.CANADA), "M!A1 model", "010f0198", user3));
		result.add(new Order(10, 100, Currency.getInstance(Locale.CANADA), "Terminator model T100", "002f0198", user4));
		result.add(new Order(50, 31000000, Currency.getInstance(Locale.CANADA), "M!A1 model", "000f0198", user5));
		result.add(new Order(100, 31000000, Currency.getInstance(Locale.CANADA), "M!A1 model", "000a0198", user6));
		result.add(new Order(210, 25, Currency.getInstance(Locale.CANADA), "Geme Gothic Armada", "000d0198", user7));
		result.add(new Order(700, 360000, Currency.getInstance(Locale.CANADA), "Bulldozer CAT", "00ff0198", user8));
		result.add(new Order(2, 10, Currency.getInstance(Locale.CANADA), "Markers", "000f0178", user9));
		return result;
	}

}
