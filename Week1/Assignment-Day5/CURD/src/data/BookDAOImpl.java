package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Book;

public class BookDAOImpl  implements BookDAOInterface{
      Connection con = DataManger.getConnect();
      
      
	@Override
	public ArrayList<Book> getAllBooks() {
		ArrayList<Book> blist = new ArrayList<Book>();
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from tbook");
		
		  while (rs.next())
		  {
			  Book book = new Book(rs.getInt(1),rs.getString(2),rs.getInt(3));
			  blist.add(book);
		  }
	  }//try block
		  catch (SQLException e) {
				System.out.println(e.getMessage());
				//e.printStackTrace();
			} 		
		return blist;
	}


	@Override
	public String addBook(Book book) {
		
		String sql = "insert into tbook values (?,?,?)";
		PreparedStatement ps;
		int res=0;
		try {
			ps = con.prepareStatement(sql);
		
		ps.setInt(1, book.getbId());
		ps.setString(2, book.getbName());
		ps.setInt(3, book.getbPrice());
		
		 res = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (res!=1)
			return "insertion failed....";
		else 
			return "Row inserted...";
		
	}


	@Override
	public boolean UpdatePrice(int bid, int bprice) {
		
		String  query = "update tbook set BPRICE=? where  BID=?";
		PreparedStatement ps;
		Boolean flag= false;
		int res=0;
		
		try {
		ps = con.prepareStatement(query);		
		ps.setInt(1, bprice);
		ps.setInt(2, bid);
		
		res = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (res==1)
			flag = true;
		
		return flag;	
		
	}


	@Override
	public Book searchBookbyName(String bname) {
		Statement  st;
		
		Book book=null;
		try {
			st = con.createStatement();
		
		ResultSet rs = st.executeQuery("select * from tbook where bname='"+bname+"'");
		
		while(rs.next())
		{
		 book = new Book(rs.getInt(1),rs.getString(2),rs.getInt(3));
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return book;
	}

}
