package practice.java;

import java.time.LocalDate;

public class Book {
	private int id;
	enum Category{FICTION,NON_FICTION,EDUCATIONAL}
	Category category;
	LocalDate listingdate;
	LocalDate stockupdatedate;
	LocalDate lastselldate;
	int stock;
	String Author;
	int price;
	int discount;
	public Book(int id, Category category, LocalDate stockupdatedate, LocalDate lastselldate,
			int stock, String author, int price, int discount) {
		super();
		this.id = id;
		this.category = category;
		this.stockupdatedate = stockupdatedate;
		this.lastselldate = lastselldate;
		this.stock = stock;
		Author = author;
		this.price = price;
		this.discount = discount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public LocalDate getListingdate() {
		return listingdate;
	}
	public void setListingdate(LocalDate listingdate) {
		this.listingdate = listingdate;
	}
	public LocalDate getStockupdatedate() {
		return stockupdatedate;
	}
	public void setStockupdatedate(LocalDate stockupdatedate) {
		this.stockupdatedate = stockupdatedate;
	}
	public LocalDate getLastselldate() {
		return lastselldate;
	}
	public void setLastselldate(LocalDate lastselldate) {
		this.lastselldate = lastselldate;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	
	 
	


}
