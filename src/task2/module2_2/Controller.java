package task2.module2_2;

public class Controller {
	
	private View view;

	public Controller(View view) {
		this.view = view;
	}
	
	public void withdrawMoney(double withdrawal, Scope scope){
		StringBuilder stringBuilder = new StringBuilder();
		double coef = 100;
		double comission = 5;
		comission = withdrawal * comission / coef;
		double summa = withdrawal + comission;
		if ( scope.getBalance() > summa ){
			stringBuilder.append(" OK " + comission);
			scope.setBalance(scope.getBalance() - summa);
			stringBuilder.append(" " + scope.getBalance());
			view.message(scope.getBalance(), withdrawal , stringBuilder.toString());
		}else{
			view.message(scope.getBalance(), withdrawal , "NO");
		}
		
	}
	
}
