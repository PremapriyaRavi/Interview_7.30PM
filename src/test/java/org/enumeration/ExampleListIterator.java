package org.enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ExampleListIterator {
	public static void main(String[] args) {
		LinkedList<Integer> v=new LinkedList();
		v.add(10);
		v.add(-5);
		v.add(30);
		v.add(70);
		v.add(90);
		v.add(50);
		System.out.println(v);
		ListIterator<Integer> el = v.listIterator();
		while(el.hasNext()) {
			Integer nx = el.next();
			System.out.println(nx);
			if(nx==50) {
				el.remove();
			}
		}
		System.out.println(v);
		while(el.hasPrevious()) {
			Integer pre = el.previous();
			System.out.println(pre);
		}
		System.out.println(v);
	}

}
