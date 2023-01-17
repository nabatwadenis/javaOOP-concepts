package com.test.stud;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(4);
		c.add(6);
		c.add(7);
		c.add(9);
		Iterator it = c.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
	}

}
