package collectionDemo;

import java.util.ArrayList;

public class Demo2 {
	
	public static void main(String[] args) {
		Emp e1 = new Emp(100, "Shubham");
		Emp e2 = new Emp(200, "akshay");
		
		ArrayList al = new ArrayList();
		al.add(e1);
		al.add(e2);
		al.add(10);
		
		// we can print list directly which contains objects other than wrapper class object
		System.out.println(al);
		System.out.println(al.get(1));
		for(Object o:al)
		{
			if(o instanceof Emp) {
				Emp e = (Emp)o;
				System.out.println(e.eid);
				System.out.println(e.ename);
				
			}
		}
	}

}
