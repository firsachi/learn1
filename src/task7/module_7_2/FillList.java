package task7.module_7_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import task4.module4_1.Currency;
import task7.module_7_1.Order;
import task7.module_7_1.User;

public class FillList {
	
	private User user0 = new User(1, "Alex", "Vata", "Lviv", 200);
	private User user1 = new User(1, "Alex", "Vata", "London", 200);
	private User user2 = new User(1, "Alex", "Vata", "Kyev", 200);
	private User user3 = new User(1, "Alex", "Vata", "Kyev", 200);
	private User user4 = new User(1, "Alex", "Vata", "London", 200);
	private User user5 = new User(1, "Alex", "Vata", "lviv", 200);
	private User user6 = new User(1, "Alex", "Vata", "Dnepr", 200);
	private User user7 = new User(1, "Alex", "Vata", "London", 200);
	private User user8 = new User(1, "Alex", "Vata", "Kyev", 200);
	private User user9 = new User(1, "Alex", "Petrov", "London", 200);
	
	public List<Order> getList(){
		List<Order> result = new ArrayList<>();
		result.add(new Order(1, 1000, Currency.USD, "HP3027", "000f0198", user0));
		result.add(new Order(3, 15000, Currency.USD, "PowerEdge", "000f0199", user1));
		result.add(new Order(31, 21000, Currency.USD, "Car", "100f0198", user2));
		result.add(new Order(12, 31000000, Currency.USD, "M!A1 model", "010f0198", user3));
		result.add(new Order(10, 100, Currency.USD, "Terminator model T100", "002f0198", user4));
		result.add(new Order(50, 31000000, Currency.USD, "M!A1 model", "000f0198", user5));
		result.add(new Order(100, 31000000, Currency.USD, "M!A1 model", "000a0198", user6));
		result.add(new Order(210, 25, Currency.USD, "Geme Gothic Armada", "000d0198", user7));
		result.add(new Order(700, 360000, Currency.USD, "Bulldozer CAT", "00ff0198", user8));
		result.add(new Order(2, 10, Currency.USD, "Markers", "000f0178", user9));
		return result;
	}
	
	public Set<Order> getSetOrder(){
		Set<Order> result = new TreeSet<>();
		result.add(new Order(1, 1000, Currency.UAH, "HP3027", "000f0198", user0));
		result.add(new Order(3, 15000, Currency.EUR, "PowerEdge", "000f0199", user1));
		result.add(new Order(31, 21000, Currency.USD, "Car", "100f0198", user2));
		result.add(new Order(12, 31000000, Currency.USD, "M!A1 model", "010f0198", user3));
		result.add(new Order(10, 100, Currency.USD, "Terminator model T100", "002f0198", user4));
		result.add(new Order(50, 31000000, Currency.UAH, "M!A1 model", "000f0198", user5));
		result.add(new Order(100, 31000000, Currency.UAH, "M!A1 model", "000a0198", user6));
		result.add(new Order(210, 25, Currency.USD, "Geme Gothic Armada", "000d0198", user7));
		result.add(new Order(210, 25, Currency.UAH, "Geme Gothic Armada", "000d0198", user7));
		result.add(new Order(2, 10, Currency.UAH, "Markers", "000f0178", user9));
		return result;
	}
}
