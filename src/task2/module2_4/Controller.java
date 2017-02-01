package task2.module2_4;

import task2.module2_2.View;

public class Controller {
	
	private View view;
	private int[] balances = {1200, 250, 2000, 500, 3200};
	private String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

	public Controller(View view) {
		this.view = view;
	}
	
	public void withdrawal(String name, int withdrawal){
		int index = 0;
		for (int i = 0; i < ownerNames.length; i++){
			if (ownerNames[i] == name){
				index = i;
				break;
			}
		}
		double summa = withdrawal + balances[index];
		StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(ownerNames[index] + withdrawal + " ");
			stringBuilder.append(" " +  summa );
			view.message(name, withdrawal , stringBuilder.toString());
	}

}
