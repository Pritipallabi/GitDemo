package OOPsDemos;

import java.util.ArrayList;

public class usingCollections {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("Java");
		al.add(false);
		
		System.out.println("No Of items in the collection : " + al.size());
		System.out.println("The Items are : ");
		for(Object item : al)
		{
			System.out.println(item);
		}
		
		//inserting element @index1
		al.add(1,40.2);
		System.out.println("After inserting element @index1 : ");
		for(Object item : al)
		{
			System.out.println(item);
		}
		
		//removing element @index 2
		
		al.remove(2);
		System.out.println("After deleting element @index2 : ");
		for(Object item : al)
		{
			System.out.println(item);
		}
	}

}






















