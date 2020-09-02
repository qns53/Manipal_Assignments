package prodaccesspack;

import java.util.ArrayList;

import datapack.Data;
import prodpack.Product;

public class ProductAccess extends Data implements ProductAccessInterface {
  // resource is arraylist 
	public ArrayList<Product> alist;
	
	public ProductAccess(ArrayList<Product> list) {
		alist=list;
	}

	@Override
	public ArrayList<Product> getAllProducts() {
		//System.out.println(alist);
		
		return alist;
	}

	@Override
	public Product getAProductbyId(int id) {
		Product temp=null;
		for (Product p:alist)  // enhanced for loop 
		{
			if (p.getpId()==id)
			{	
				temp =p;
				break;
			}
		}
		
		return temp;
	}

	@Override
	public Product getAPrdouctbyName(String name) {
		// TODO Auto-generated method stub
		Product temp=null;
		for (Product p:alist)  // enhanced for loop 
		{
			if (p.getpName()==name)
			{	
				temp =p;
				break;
			}
		}
		
		return temp;	
		}

	

}
