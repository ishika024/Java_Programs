/*
    Implementing Vector.
	VECTOR CLASS:     new Vector()
					  new Vector(int size)
					  new Vector(Collecton c)
	
*/

import java.util.*;
class Product
{
	String name;
	int quantity;
	double price;
	Product(String n, int q, double p)       // Constructor 
	{
		name = n;
		quantity = q;
		price = p;
	}
	void printDetails()
	{
		System.out.println(name + "\t"+ price+ "\t" + quantity);
	}
}
class VectorMain {
	public static void main(String[] args)
	{
		Vector prod = new Vector(5);
		Product p1 = new Product("Pen",10,20.0);
		prod.add(p1);              // for add the value in Vector  {   add(Object obj), add(2,Object obj)  0,1,2....size-1   }
		for(int i=0; i<prod.size(); i++)
		{
			((Product)prod.get(i)).printDetails();   // for display the values  {    get(index)   }
		}
	}
}