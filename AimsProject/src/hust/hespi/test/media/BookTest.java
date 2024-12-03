package hust.hespi.test.media;

import hust.hespi.aims.media.Book;

public class BookTest {

	public static void main(String[] args) {
		Book Book = new Book();
		Book.addAuthor("hello");
		Book.addAuthor("world");
		Book.addAuthor("hello");
		Book.removeAuthor("world");
		Book.removeAuthor("isekai");
	}

}
