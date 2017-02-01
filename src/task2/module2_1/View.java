package task2.module2_1;

public class View {

	public void message(String value){
		System.out.println(value);
	}
	public void message(String message1, String meassage2 ){
		message(String.format(message1, meassage2));
	}
	
	public void message(String string, String mod, int integer){
		message(String.format(string, mod, integer));
	}
	
	public void message(String string, String mod, double value){
		message(String.format(string, mod, value));
	}
}
