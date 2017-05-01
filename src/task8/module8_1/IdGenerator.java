package task8;

public final class IdGenerator {
	
	public static final long generateId(){
		return  (long)(Math.random() * 10000000);
	}
}
