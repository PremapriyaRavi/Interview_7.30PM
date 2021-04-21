package org.enumeration;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class EmployeeVector {
	public static void main(String[] args) {
		
		//ArrayList<Integer> v=new ArrayList(); 
		Vector<Integer> v=new Vector<Integer>();
		v.add(10);
		v.add(-5);
		v.add(30);
		v.add(70);
		v.add(90);
		v.add(50);
		System.out.println(v);
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements())
		{
			Integer nxtEle = e.nextElement();
			System.out.println(nxtEle);
		}
	}
}
