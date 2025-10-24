package day7;

public class Entry {

	public static void main(String[] args) {
		LinkList<String> list = new LinkList<>();

		
		insert(list);
		delete(list);
		display(list);
		

	}

	public static void display(TraverseList<?> obj) {
		String data = (String) obj.getFirst();

		while (data != null) {
			System.out.println(data.toString());
			data = (String) obj.getNext();
		}
	}
	
	public static void insert(List<String> obj) {
		obj.add("Kapeesh");
		obj.add("Sarthak");
		obj.add("Prince");
		obj.add("Prateek");
	}
	
	public static void delete(List<String> obj) {
		obj.delete(3);
	}


}
