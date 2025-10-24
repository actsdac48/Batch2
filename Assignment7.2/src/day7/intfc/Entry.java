package day7.intfc;

public class Entry {

	public static void main(String[] args) {
		LinkList<String> list = new LinkList<>();

		
		insert(list);
		delete(list);
		display(list);
		
		

	}

	public static void display(LinkList<String> obj) {
		for(String data: obj) {
			System.out.println(data);
		}
	}
	
	public static void insert(LinkList<String> obj) {
		obj.add("Kapeesh");
		obj.add("Sarthak");
		obj.add("Prince");
		obj.add("Prateek");
	}
	
	public static void delete(LinkList<String> obj) {
		obj.delete(3);
	}


}
