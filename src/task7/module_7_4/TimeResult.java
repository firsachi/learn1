package task7.module_7_4;

public class TimeResult {
	
	private long start;
	private long end;
	
	public void setStartTime(){
		start = System.nanoTime();
	}
	
	public void setEndTime(){
		end = System.nanoTime();
	}
	
	public long getTimeResult(){
		return end - start;
	}

}
