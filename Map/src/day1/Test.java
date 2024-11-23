package day1;

import java.util.*;
import java.util.Map;

public class Test {
		public static void main (String[]args) {
			Student s1 = new Student();
					s1.setRollno(1);
					s1.setName("aaa");
					
			Student s2 = new Student();
					s2.setRollno(2);
					s2.setName("bbb");
					
			Map<String, Student> m = new HashMap<>();
					m.put("aaa", s1);
					m.put("bbb", s2);
					System.out.println(m);
					
					Set<String> s = m.keySet();
					System.out.println(s);
					
					for (String k : s) {
						System.out.println(k);
						
						Student val = m.get(k);
						System.out.println(val.getRollno());
						System.out.println(val.getName());
						
						
					}
			
			
			
		}
}
