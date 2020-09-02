package datapack;

import java.util.ArrayList;

import prodpack.Product;

public class Data {
	protected ArrayList<Product>  alist;
	public Data() {
		alist = new ArrayList<Product>();
	}
	public ArrayList<Product> getAlist() {
		return alist;
	}

}
