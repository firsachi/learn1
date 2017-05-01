package task8;

import java.util.List;

public interface AbstractDao<T> {
	
	T save(T entity);
	void delete(T entity);
	void deleteAll(List<T> list);
	void saveAll(List<T> list);
	List<T> getList();
}