package day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class B {
	public static void main(String [] args) {
		Map<String,String> m = new HashMap<>();
				m.put("aaa", "python");
				m.put("bbb", "Java");
				m.put("ccc", "cjc");
				System.out.println(m);
				
				Set <String> s = m.keySet();
					System.out.println(s);
					
					for(String K : s) {
						System.out.println(s);
						
					String val = m.get(K);
							System.out.println(val);
					}
				
				}
	

}
