package task2.module2_1;

public class Runner {

	public static void main(String[] args){
		View view = new View();
		Model model = new Model();
		new Controller(view, model);
	}
}
