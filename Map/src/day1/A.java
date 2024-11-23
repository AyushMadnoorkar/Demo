package day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A {
	public static void main (String [] args)
	{
		Map<Integer,String> m = new HashMap<>();
			m.put(5,"java");
			m.put(6,"python");
			m.put(5,"cjc");
			m.put(10,"Spring");
			System.out.print(m);
			
	Set<Integer> Keys = m.keySet();
			System.out.println(Keys);
			
			for(int k : Keys) {
				System.out.println(k);
				
			String val = m.get(k);
			System.out.println(val);
			}
			
			
	}
}
