package task2.module2_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {
	
	private View view;
	private Model model;

	public Controller(View view, Model model){
		this.view = view;
		this.model = model;
		inputArray();
	}
	
	private void inputArray(){
		view.message(Messages.START_MESSAGES, Messages.INT);
		int size = 5;
		int arrayInt[] = new int[size];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < size; i++ ){
			arrayInt[i] = inputInt(scanner); 
		}
		showInt(arrayInt);
		view.message(Messages.START_MESSAGES, Messages.DOUBLE);
		double arrayDouble[] = new double[size];
		for ( int i = 0; i < size; i++){
			arrayDouble[i] = inputDouble(scanner);
		}
		showDouble(arrayDouble);
		scanner.close();
	}
	
	private int inputInt(Scanner scanner){
		int result = 0;
		try {
			view.message(Messages.INPUT, Messages.INT);
			result = scanner.nextInt();
			return result;
		}catch (InputMismatchException e) {
			view.message(Messages.ERROR_NOT_NUMBER);
			scanner.nextLine();
		}
		return result;
	}
	
	private double inputDouble(Scanner scanner){
		double result = 0.0;
		try {
			view.message(Messages.INPUT, Messages.DOUBLE);
			result = scanner.nextDouble();
		}catch (Exception e) {
			view.message(Messages.ERROR_NOT_NUMBER);
			scanner.nextLine();
		}
		return result;
	}
	
	private void showInt(int array[]){
		view.message(Messages.MESSAGES_DEFAULT,Messages.SUM, model.sum(array));
		view.message(Messages.MESSAGES_DEFAULT, Messages.MIN, model.min(array));
		view.message(Messages.MESSAGES_DEFAULT, Messages.MAX, model.max(array));
		int modules[] = model.modulust(array);
		view.message(Messages.MESSAGES_DEFAULT, Messages.FIRST_MODULE, modules[0]);
		view.message(Messages.MESSAGES_DEFAULT, Messages.END_MODULE, modules[1]);
		view.message(Messages.MESSAGES_DEFAULT, Messages.SECOND, model.second(array));
	}
	
	private void showDouble(double array[]){
		view.message(Messages.MESSAGES_DEFAULT,Messages.SUM, model.sum(array));
		view.message(Messages.MESSAGES_DEFAULT, Messages.MIN, model.min(array));
		view.message(Messages.MESSAGES_DEFAULT, Messages.MAX, model.max(array));
		double modules[] = model.modulust(array);
		view.message(Messages.MESSAGES_DEFAULT, Messages.FIRST_MODULE, modules[0]);
		view.message(Messages.MESSAGES_DEFAULT, Messages.END_MODULE, modules[1]);
		view.message(Messages.MESSAGES_DEFAULT, Messages.SECOND, model.second(array));
	}
	
}
