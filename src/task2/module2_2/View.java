package task2.module2_2;

public class View {
	
	public final String message = "\n Input \n \n balance = %d \n withdrawa = %d \n \n Output \n %s";
	public final String messageArray = "\n Input \n \n owner name = %s \n withdrawa = %d \n \n Output \n %s";
	
	public void message(String message){
		System.out.println(message);
	}
	
	public void message(double balance, double withdrawa, String value){
		message(String.format(message, (int) balance, (int) withdrawa, value));
	}
	
	public void message(String ownerName, double withdrawa, String value){
		message(String.format(messageArray, ownerName, (int) withdrawa, value));
	}
}
