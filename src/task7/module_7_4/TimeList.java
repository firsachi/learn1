package task7.module_7_4;

import java.util.List;

public class TimeList<T> {
	
	
	private TimeResult timeResult = new TimeResult();
	private List<T> result;
	
	public void setList(List<T> list){
		this.result = list;
	}

	public List<T> getList(){
		return this.result;
	}
	
	public void add(T val, int size){
		timeResult.setStartTime();
		for(int index = 0; index < size; index++){
			result.add(val);
		}
		timeResult.setEndTime();
	}
	
	public void set(T val, int size){
		timeResult.setStartTime();
		for(int index = 0; index < size; index++){
			result.set(index, val);
		}
		timeResult.setEndTime();
	}
	
	public void get(int size){
		timeResult.setStartTime();
		for(int index = 0; index < size; index++){
			result.get(index);
		}
		timeResult.setEndTime();
	}
	
	public void remove(){
		timeResult.setStartTime();
		result.clear();
		timeResult.setEndTime();
	}
	
	public long getTimeResult(){
		return timeResult.getTimeResult();
	}
}
