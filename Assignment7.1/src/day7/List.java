package day7;

public interface List<T> extends TraverseList<T> {
	 public void delete(int index);
	 public void add(T data);
}
