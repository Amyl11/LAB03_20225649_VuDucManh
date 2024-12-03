package hust.hespi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	
	private List<String> authors = new ArrayList<String>();
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(String title) {
		super(title);
	}
	
	public Book(String title, String category, float cost) {
		super(title,category,cost);
	}
	
	public int addAuthor(String name) {
		for(String i:authors) {
			if(i.equals(name)) {
				System.out.println("This author already exists!");
				return 0;
			}
		}
		authors.add(name);
		System.out.println("Added author successfully!");
		return 1;
	}
	
	public int removeAuthor(String name) {
		for(String i:authors) {
			if(i.equals(name)) {
				authors.remove(name);
				System.out.println("Removed author successfully!");
				return 1;
			}
		}
		System.out.println("This author does not exist!");
		return 0;
	}
	
	public String toString() {
		return ("Book - [" + getTitle() +"] - ["+ getCategory() +"]: "+ getCost() + "$\n");
	}
	
}
