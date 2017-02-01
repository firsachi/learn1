package task2.module2_3;

import task2.View;

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
		double coef = 100;
		double comission = 5;
		comission = withdrawal * comission / coef;
		double summa = withdrawal + comission;
		StringBuilder stringBuilder = new StringBuilder();
		if ( balances[index] > summa ){
			stringBuilder.append(ownerNames[index] + withdrawal);
			stringBuilder.append(" " + (balances[index] - summa ));
			view.message(name, withdrawal , stringBuilder.toString());
		}else{
			view.message(name, withdrawal , "NO");
		}
	}

}
