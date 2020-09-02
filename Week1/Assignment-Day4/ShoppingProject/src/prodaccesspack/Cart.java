package prodaccesspack;
import java.util.HashMap;

import prodpack.*;
public class Cart {
	public HashMap<Product,Integer> cart;
	
	public Cart() {
		cart=new HashMap<Product,Integer>();
	}

	public HashMap<Product, Integer> getCart() {
		return cart;
	}

	public void setCart(HashMap<Product, Integer> cart) {
		this.cart = cart;
	}
	

}
