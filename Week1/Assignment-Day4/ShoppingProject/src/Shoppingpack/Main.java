package Shoppingpack;

import java.util.ArrayList;
import java.util.Scanner;

import adminpack.Admin;
import datapack.Data;
import prodaccesspack.Cart;
import prodaccesspack.ProductAccess;
import prodpack.Product;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Data d=new Data();
		ProductAccess paob = new ProductAccess(d.getAlist());
		Admin admin=new Admin(d.getAlist());
		Cart c=new Cart();
		
		
     //  int i=0;
		while(true){
			
			System.out.println("1. Add  a product");
			System.out.println("2. Get all products");
			System.out.println("3. Get a product by id");
			System.out.println("4. Get a product by name");
			System.out.println("5. Add Item to Cart");
			System.out.println("6. Generate Bill");
			System.out.println("7. Exit"); 
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch(choice){
			case 1:
			{
				System.out.println("Enter the product id:");
				int pid = sc.nextInt();
				System.out.println("Enter the product name");
				String pname = sc.next();
				System.out.println("enter the product price");
				int pprice = sc.nextInt();
				
				Product p = new Product(pid,pname,pprice);
				
				System.out.println(admin.addProduct(p)); 				
				break;
			
			}
			case 2: 
			{
				
				ArrayList<Product> plist= paob.getAllProducts();
				System.out.println();
				for (Product p:plist)
				{
					System.out.print(p);
				}
				System.out.println();
				
				break;
			}
			case 3:
			{
				System.out.println(" Enter the product id to be searched:");
				int id = sc.nextInt();
				Product product= paob.getAProductbyId(id);
				if (product!=null)
				{
				System.out.println("Product found");
				System.out.println(product);
				}
				else 
					System.out.println("Product not found ");
				break;
			}
			case 4:
			{
				 // equals() with strings 
				System.out.println(" Enter the product name to be searched:");
				String name = sc.next();
				Product product= paob.getAPrdouctbyName(name);
				
				if (product!=null)
				{
				System.out.println("Product found");
				System.out.println(product);
				}
				else 
					System.out.println("Product not found ");
				break;
			}
			case 5:{
				
				System.out.println("Enter Product id: ");
				int pid=sc.nextInt();
				System.out.println("Enter Quantity: ");
				int q=sc.nextInt();
				c.getCart().put(paob.getAProductbyId(pid), q);
				System.out.println("Product entered Successfully...");
				
				break;
			}
			case 6:{
				
				System.out.println("Your Bill is: "+admin.billing(c));
				break;
			}
		
			case 7:
			{	
				sc.close();
				System.exit(0);
			}
			
		}
		
	}
	
	

	}

}
