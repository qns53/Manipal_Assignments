package data;

import java.util.ArrayList;

import model.Book;

public interface BookDAOInterface {
	
	ArrayList<Book> getAllBooks();
	String addBook(Book book);
	boolean UpdatePrice(int bid,int bprice);
	Book searchBookbyName(String bname);

}
