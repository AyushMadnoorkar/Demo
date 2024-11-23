package day1;

import java.util.*;

public class Task1 {
	public static void main (String[] args)
	{
		Map<String,String> m = new HashMap<>();
				
				m.put("A", "abc");
				m.put("B", "pqr");
				m.put("C", "xyz");
				
		Set<String> s = m.keySet();
			System.out.println(s);
			
		for (String k : s) {
			System.out.println(k);
			
		String val = m.get(k);
		System.out.println(val);
			
		}
			
		
				
			
	}

}
