package cn.mldn.demo;
class Book{
	private String title;
	private double price;
	
	public Book() {
		super();
	}
	
	public Book(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
	
}
public class Hello {

	public static void main(String[] args) {
	System.out.println("H");

	}

}
