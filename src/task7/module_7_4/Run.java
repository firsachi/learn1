package task7.module_7_4;

import java.util.ArrayList;
import java.util.LinkedList;

public class Run {

	public static void main(String[] args) {
		TimeList<Integer> listInteger = new TimeList<>();
		listInteger.setList(new ArrayList<>());
		time("Integer", listInteger, new Integer(1));
		listInteger.setList(new LinkedList<>());
		time("Integer", listInteger, new Integer(1));
		
		TimeList<String> listString = new TimeList<>();
		listString.setList(new ArrayList<>());
		time("String", listString, new String("a"));
		listString.setList(new LinkedList<>());
		time("String", listString, new String("a"));
		
	}

	private static <T> void time(String message, TimeList<T> listInteger, T value) {
		int size = 1000;
		System.out.println(message + " list = " + size);
		listInteger.add(value , size);
		System.out.println(message + " add =" + listInteger.getTimeResult());
		listInteger.set(value, size);
		System.out.println(message + " set =" + listInteger.getTimeResult());
		listInteger.get(1000);
		System.out.println(message + " get =" +listInteger.getTimeResult());
		listInteger.remove();
		System.out.println(message + " remove =" +listInteger.getTimeResult());
		System.out.println("\n");
		
		size = 10000;
		System.out.println("Size list = " + size);
		listInteger.add(value, size);
		System.out.println(message + " add =" + listInteger.getTimeResult());
		listInteger.set(value, size);
		System.out.println(message + " set =" + listInteger.getTimeResult());
		listInteger.get(1000);
		System.out.println(message + " get =" +listInteger.getTimeResult());
		listInteger.remove();
		System.out.println(message + " remove =" +listInteger.getTimeResult());
		System.out.println("\n");
	}
	
}
