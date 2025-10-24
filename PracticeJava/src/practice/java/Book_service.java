package practice.java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import practice.java.Book.Category;

public class Book_service {
	List<Book> collection = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public void add() {
		int id = 0;
		System.out.println("Enter category");
		Category category = Category.valueOf(sc.next().toUpperCase());
		System.out.println("Enter Stock");
		int stock = sc.nextInt();
		System.out.println("Enter Author");
		String Author = sc.next();
		System.out.println("Enter price");
		int Price = sc.nextInt();
		System.out.println("Enter Discount");
		int discount = sc.nextInt();
		System.out.println("Enter Stockupdatedate(yyyy-mm-dd)");
		String date = sc.next();
		LocalDate stockupdatedate = LocalDate.parse(date);
		System.out.println("Enter Lastselldate(yyyy-mm-dd)");
		String lastsell = sc.next();
		LocalDate lastselldate = LocalDate.parse(lastsell);

		Book obj = new Book(++id, category, stockupdatedate, lastselldate, stock, Author, Price, discount);
		collection.add(obj);

	}

	public void modifyprice() {
		System.out.println("enter category");
		String cat = sc.next();
		List<Book> temp = new ArrayList<>();
		for (Book B : collection) {
			if (B.getCategory().name().equals(cat)) {
				temp.add(B);
			}

		}
		for (Book B : collection) {
			System.out.println(B);
		}
		System.out.println("Enter ID for Price modification");
		int ID = sc.nextInt();
		for (Book B : collection) {
			if (B.getId() == ID) {
				System.out.println("Enter new Price");
				int price=sc.nextInt();
				B.setPrice(price);
			}
			

		}

	}
}
