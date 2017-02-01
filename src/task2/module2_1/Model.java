package task2.module2_1;

public class Model {
	
	public int sum(int array[]){
		int result = 0;
		for (int value : array){
			result += value;
		}
		return result;
	}
	
	public double sum(double array[]){
		double result = 0.0;
		for(double value : array){
			result += value;
		}
		return result;
	}
	
	public int min(int array[]){
		int result = array[0];
		for ( int i = 1; i < array.length; i++){
			if ( result > array[i]){
				result = array[i];
			}
		}
		return result;
	}
	
	public double min(double array[]){
		double result = array[0];
		for (int i = 1; i < array.length; i++){
			if ( result > array[i]){
				result = array[i];
			}
		}
		return result;
	}
	
	public int max(int array[]){
		int result = array[0];
		for (int i = 1; i < array.length; i++){
			if (result < array[i]){
				result = array[i];
			}
		}
		return result;
	}
	
	public double max(double array[]){
		double result = array[0];
		for (int i = 1; i < array.length; i++){
			if ( result > array[i]){
				result = array[i];
			}
		}
		return result;
	}
	
	public int[] modulust(int array[]){
		int result[] = new int[2];
		result[0] = Math.abs(array[0]);
		result[1] = Math.abs(array[array.length - 1]);
		return result;
	}
	
	public double[] modulust(double array[]){
		double result[] = new double[2];
		result[0] = array[0];
		result[1] = array[array.length -1];
		return result;
	}
	
	public int second(int[] array){
		int bigElement = array[0];
		int secondBigElement = 0;
		for (int i = 1; i < array.length; i++){
			if (bigElement > array[i] && secondBigElement < array[i]){
				secondBigElement = array[i];
			}else if (bigElement < array[i]) {
				secondBigElement = bigElement;
				bigElement = array[i];
			}
		}
		return secondBigElement;
	}
	
	public double second(double array[]){
		double bigElement = array[0];
		double secondBigElement = 0.0;
		for (int i = 1; i < array.length;i++){
			if (bigElement > array[i] && secondBigElement < array[i]){
				secondBigElement = array[i];
			}else if (bigElement < array[i]) {
				secondBigElement = bigElement;
				bigElement = array[i];
			}
		}
		return secondBigElement;
	}
}
