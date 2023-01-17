package com.test.stud;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, String> m = new Hashtable<>();
		m.put("name", "Ovich");
		m.put("job", "Software Developer");
		m.put("hobbies", "drawing");
		
		Set<String> keys = m.keySet();
		for(String key: keys) {
			System.out.println(key +" "+ m.get(key));
			
		}
		

	}

}
