package task7.module_7_4;

import java.util.Date;

public class Run {

	public static void main(String[] args) {
		TimeArrayList<Integer> listInteger = new TimeArrayList<>();
		long start = System.nanoTime();
		System.out.println(listInteger.getList());
		listInteger.add(new Integer(1), 1000 );
		long end = System.nanoTime();
		System.out.println(String.format("%d", end - start));
	}
}
