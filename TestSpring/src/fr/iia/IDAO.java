package fr.iia;

import java.util.List;

public interface IDAO<T> {
	
	public T find(int id);
	public List<T> finAll();
	public T save(T object);
	public boolean delete(T object);

}
