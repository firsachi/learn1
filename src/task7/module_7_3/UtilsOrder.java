package task7.module_7_3;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

public final class UtilsOrder {

	public static final <T> Set<T> filter(Set<T> arg1, Predicate<T> pr1){
		Set<T> result = new TreeSet<>();
		for (T val : arg1){
			if (pr1.test(val)){
				result.add(val);
			}
		}
		return result;
	}
	
	public static final <T> Set<T> removeIterator(Set<T> arg1, Predicate<T> pr1){
		for(Iterator<T> it = arg1.iterator(); it.hasNext(); ) {
			T t = it.next();
			if(pr1.test(t)) {
				it.remove();
			}
		}
		return arg1;
	}
}
