package linkedlist.customException;

public class Enrty {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
		try {
			list.getFirst();
		} catch (TraverseException e) {
			System.out.println(e.getMessage());
			System.out.println("Add node");
		}
		
		try {
			list.add("Kapeesh");
			list.add("Sarthak");
			list.add("Prince");
			list.add("Prateek");
			list.add("Naeem");
			list.add("Anuraj");
		} catch (UpdateException e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			String displayData= list.getFirst();
			
			while(displayData!=null) {
			System.out.println(list.current.data);
				
				displayData=list.getNext();
			
			}
		} catch (TraverseException e) {
			System.out.println(e.getMessage());
		}

	}

}
