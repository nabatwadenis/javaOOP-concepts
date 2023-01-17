package com.test.stud;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;



public class CollectList {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		values.add(404);
		values.add(908);
		values.add(639);
		values.add(265);
		Iterator it = values.iterator();
		
	     // 1 means swap the elements
			
		Collections.sort(values, (i, j) -> i%10>j%10? 1: -1);
		
		
		for(Integer o: values) {
			System.out.println(o);
		}

	}

}
