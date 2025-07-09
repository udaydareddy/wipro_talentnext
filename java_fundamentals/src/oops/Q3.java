package oops;
import java.util.*;
class Author{
	private String name;
	private String email;
	private char gender;
	public Author(String name, String email, char gender) {
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setmail(String email) {
		this.email=email;
	}
	public void setgender(char gender) {
		this.gender=gender;
	}
	public String getname() {
		return name;
	}
	public String getemail() {
		return email;
	}
	public char getgender() {
		return gender;
	}
	public String toString() {
		return "Author details: author name "+name+" email "+email+"gender "+gender;
	}
}
class Book{
	private String name;
	private Author author;
	private double price;
	private int quantity;
	Book(String name, Author author, double price, int quantity){
		this.name=name;
		this.author=author;
		this.price=price;
		this.quantity=quantity;
	}
	public void setname(String name){
		this.name=name;
	}
	public void setauthor(Author author) {
		this.author=author;
	}
	public void setprice(double price) {
		this.price=price;
	}
	public void setquantity(int quantity) {
		this.quantity=quantity;
	}
	public String getname() {
		
		return name;
	}
	public Author getauthor() {
		return author;
	}
	public double getprice() {
		return price;
	}
	public int getquantity() {
		return quantity;
	}
	public String display() {
        return "Book Name: " + name + "\n" +
               "Price: ₹" + price + "\n" +
               "Quantity in Stock: " + quantity + "\n" +
               "Author Details: " + author.toString();
		

	}
}
public class Q3 {

	public static void main(String[] args) {
		Author author = new Author("J.K. Rowling", "jkrowling@example.com", 'F');
        Book book = new Book("Harry Potter", author, 599, 100);

        System.out.println(book.display());
		
	}

}
