package task2.module2_2;


public class Runner {
	
	public static void main(String[] args){
		Controller controller = new Controller(new View());
		controller.withdrawMoney(10.0, new Scope(100));
		controller.withdrawMoney(99, new Scope(100));
	}
}
