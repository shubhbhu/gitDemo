package collectionDemo;

import java.util.ArrayList;

public class Demo1
{
	// general declaration
	// not type safe
	// heterogeneous data can be stored
	public static void main(String[] args)
	{
		// in collection we can not store primitive data
		// 
		ArrayList al = new ArrayList();
		// add() method used to add element in arraylist
		al.add(10);// autoboxing
		al.add(10.5);
		al.add("shubham");// al.add(String.valueOf("shubham"))
		
		al.add(Integer.valueOf(20));// manual conversion
		
		// when list contain only primitive data (Wrapper class object)then it can be printed directly
		System.out.println(al);
		System.out.println(al.toString());// alternate way of printing list
		
		// to print single element from list get method is used
		
		System.out.println(al.get(2));
		
		
		
	}
	

}
