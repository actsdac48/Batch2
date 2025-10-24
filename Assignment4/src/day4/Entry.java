package day4;

import consoleInput.GetInput;

public class Entry {

	public static void main(String[] args) {
		
		Employee arrEmp[]=new Employee[10];
		String name, address;
		int age;
		boolean gender;
		float basicSalary, hra, overtime, commission;
		
		int count=0;
		
		int choice;
		
		
		do {
			System.out.println("Enter Your Choice ---->");
			System.out.println("1.Add Employee");
			System.out.println("2.Display All");
			System.out.println("3.Save");
			System.out.println("4.Load");
			System.out.println("5.Sort");
			System.out.println("6.Exit");
			
			choice=GetInput.getInt();
			
			switch(choice) {
			case 1:{
				int option;
				do {
				System.out.println("1.Manager");
				System.out.println("2.Engineer");
				System.out.println("3.SalesPerson");
				System.out.println("4.Exit");
				
				option=GetInput.getInt();
				
				
				
				
				switch(option) {
				case 1: {
					System.out.println("Enter Name");
					name=GetInput.getString();
					System.out.println("Enter Address");
					address=GetInput.getString();
					System.out.println("Enter Age");
					age=GetInput.getInt();
					System.out.println("Enter Gender: True for Male and False for Female");
					gender=GetInput.getBoolean();
					System.out.println("Enter Basic Salary");
					basicSalary=GetInput.getFloat();
					System.out.println("Enter HRA");
					hra=GetInput.getFloat();
					arrEmp[count++]= new Manager(name, address, age, gender, basicSalary, hra);
					break;
				}
				case 2:{
					System.out.println("Enter Name");
					name=GetInput.getString();
					System.out.println("Enter Address");
					address=GetInput.getString();
					System.out.println("Enter Age");
					age=GetInput.getInt();
					System.out.println("Enter Gender: True for Male and False for Female");
					gender=GetInput.getBoolean();
					System.out.println("Enter Basic Salary");
					basicSalary=GetInput.getFloat();
					System.out.println("Enter Overtime");
					overtime=GetInput.getFloat();
					arrEmp[count++]= new Engineer(name, address, age, gender, basicSalary, overtime);
					break;
				}
				case 3:{
					System.out.println("Enter Name");
					name=GetInput.getString();
					System.out.println("Enter Address");
					address=GetInput.getString();
					System.out.println("Enter Age");
					age=GetInput.getInt();
					System.out.println("Enter Gender: True for Male and False for Female");
					gender=GetInput.getBoolean();
					System.out.println("Enter Basic Salary");
					basicSalary=GetInput.getFloat();
					System.out.println("Enter Commission");
					commission=GetInput.getFloat();
					arrEmp[count++]= new SalesPerson(name, address, age, gender, basicSalary, commission);
					break;
				}
				default: break;
				}
				}while(option!=4);
				break;
			}
				
			case 2:{
				for(int i = 0; i<count; i++) {
					System.out.println(arrEmp[i].toString());
				}
			}
				
			case 3: break;
				
			case 4: break;
				
			case 5:{
				int option;
				do {
				System.out.println("1.By Name");
				System.out.println("2.By Designation");
				System.out.println("3.Exit");
				
				option=GetInput.getInt();
				
				
				switch(option) {
				case 1: {
					for(int i=0; i<count; i++) {
						for(int j=i+1; j<count; j++) {
							int compare=arrEmp[i].getName().compareTo(arrEmp[j].getName());
							
							if(compare > 0) {
								Employee temp = arrEmp[i];
								arrEmp[i]=arrEmp[j];
								arrEmp[j]=temp;
							}
						}
						
					}
					for(int k=0; k<count; k++) {
						System.out.println(arrEmp[k].toString());
					}
					break;
				}
				case 2:{
					int ch;
					System.out.println("1. Manager   2.Engineer   3.SalesPerson");
					ch=GetInput.getInt();
					for(int i=0; i<count; i++) {
					if(ch==1) {
						if(arrEmp[i] instanceof Manager) {
							System.out.println(arrEmp[i].toString());
						}
					} 
					if(ch==2) {
						if(arrEmp[i] instanceof Engineer) {
							System.out.println(arrEmp[i].toString());
						}
					}
					if(ch==3) {
						if(arrEmp[i] instanceof SalesPerson) {
							System.out.println(arrEmp[i].toString());
						}
					}
					}
					break;
				}
				default: break;
				}
				}while(option!=3);
				break;
				
			}
				
			default:
			}
		}while(choice!=6);

	}

}
