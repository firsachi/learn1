package task7.module_7_4;

import java.util.ArrayList;
import java.util.List;

public class TimeArrayList<T> {
	
	private List<T> result = new ArrayList<>();

	public List<T> getList(){
		return this.result;
	}
	
	public void add(T val, int size){
		int index = 0;
		while (index < size) {
			result.add(val);
			index++;
		}
	}
	
	

}
