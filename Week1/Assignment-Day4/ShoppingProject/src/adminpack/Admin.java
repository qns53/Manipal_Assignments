package adminpack;

import java.util.ArrayList;


import prodaccesspack.Cart;
import prodpack.Product;

public class Admin{
	public ArrayList<Product> alist;
	
	public Admin(ArrayList<Product> list) {
		alist=list;
	}
	
	public String addProduct(Product prod) {
		
		alist.add(prod);
		
		return "Product added successfully";
	}
	
	public int billing(Cart c) {
		int res=0;
		for(Product n:c.getCart().keySet()) {
			res=res+(n.getpPrice()*c.getCart().get(n));
		}
		return res;
	}
}
