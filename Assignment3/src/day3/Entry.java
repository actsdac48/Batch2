package day3;

import consoleInput.GetInput;

public class Entry {

	public static void main(String[] args) {
		
		System.out.println("Enter Day");
		int day=GetInput.getInt();
		
		System.out.println("Enter Day");
		int month=GetInput.getInt();

		System.out.println("Enter Day");
		int year=GetInput.getInt();
		
		Date date = new Date(day, month, year);
		
		
		int choice;
		
		do {
			
			System.out.println("Enter Your Choice --->");
			System.out.println("1.Add Days");
			System.out.println("2.Add Months");
			System.out.println("3.Add Year");
			System.out.println("4.Exit");
	
			choice= GetInput.getInt();
			
			switch(choice) {
			case 1:{
				int addDay;
				System.out.println("Enter number of days to add");
				addDay=GetInput.getInt();
				date.addDay(addDay);
				date.display();
				break;
			}
				
			case 2:{
				int addMonth;
				System.out.println("Enter number of months to add");
				addMonth=GetInput.getInt();
				date.addDay(addMonth);
				date.display();
				break;
			}
				
			case 3:{
				int addYear;
				System.out.println("Enter number of Year to add");
				addYear=GetInput.getInt();
				date.addDay(addYear);
				date.display();
				break;
			}
				
			default : break;
				
			}
			
		}while(choice!=4);
		
	}

}
