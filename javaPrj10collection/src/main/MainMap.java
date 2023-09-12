package main;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainMap {

	public static void main(String[] args) {
		
		 Map<String, User> m = new HashMap<String, User>();
	      
	      // 유저 객체 여러 개 만들고 컬렉션에 담기
	      User one = new User("User01", "1111");
	      User two = new User("User02", "2222");
	      User three = new User("User03","3333");
	      m.put(one.getId(), one);
	      m.put(two.getId(), two);
	      m.put(three.getId(), three);
	      
	      // 컬렉션에 들어있는 여러 객체 전부 다 출력(모든 필드)
	      System.out.println(m);
	      
	      // 컬렉션에 들어있는 여러 객체 전부 출력(id)
	      // 컬렉션에 들어있는 여러 객체 전부 출력(pwd)
	      Set<String> ks = m.keySet();
	      Collection<User> vc = m.values();
	      
	      for(String k : ks) {
	         System.out.println(k);
	      }
	      
	      for(User v : vc) {
	         System.out.println(v);
	      }
		
	}

}
