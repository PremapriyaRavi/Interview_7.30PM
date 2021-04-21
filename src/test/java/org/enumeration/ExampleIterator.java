package org.enumeration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ExampleIterator {
	//It supprts both arraylist,linklist,vector
	public static void main(String[] args) {
		//ArrayList<Integer> v=new ArrayList();
		LinkedList<Integer> v=new LinkedList();
		v.add(10);
		v.add(-5);
		v.add(30);
		v.add(70);
		v.add(90);
		v.add(50);
		System.out.println(v);
		Iterator<Integer> el = v.iterator();
		while(el.hasNext()) {
			Integer nx = el.next();
			System.out.println(nx);
			if(nx==50) {
				el.remove();
			}
		}
		System.out.println(v);
	}
}