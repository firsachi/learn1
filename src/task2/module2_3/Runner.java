package task2.module2_3;


import task2.module2_2.View;

public class Runner {

	public static void main(String[] args) {
		View view = new View();
		Controller controller = new Controller(view);
		controller.withdrawal("Oww", 600);
	}

}
