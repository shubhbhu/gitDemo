package collectionDemo;

import java.util.ArrayList;

public class Demo3 {
	
	public static void main(String[] args) {
		//Emp e1 = new Emp(100, "Shubham");
		//Emp e2 = new Emp(200, "akshay");
		
		ArrayList<Emp>al = new ArrayList<Emp>();
		al.add(new Emp(100, "Shubham"));
		al.add(new Emp(200, "akshay"));
		//al.add(10);
		
		// we can print list directly which contains objects other than wrapper class object
		System.out.println(al);
		System.out.println(al.get(0));
		
		for(Object o:al)
		{
			if(o instanceof Emp) {
				Emp e = (Emp)o;
				System.out.println(e.eid);
				System.out.println(e.ename);
				
			}
		}
		for (Emp e:al)
		{
			System.out.println(e.eid);
			System.out.println(e.ename);
		}
	}

}
