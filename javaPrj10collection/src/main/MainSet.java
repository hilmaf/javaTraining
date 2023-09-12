package main;

import java.util.HashSet;
import java.util.Set;

public class MainSet {

	public static void main(String[] args) {
		 // User 객체들을 관리할 컬렉션 생성하기
        Set<User> userSet = new HashSet<User>();
        
        // 객체 여러 개 생성 후 Set컬렉션에 담기
        userSet.add(new User("user01", "1111"));
        userSet.add(new User("user02", "2222"));
        userSet.add(new User("user03", "3333"));
        
        // Set컬렉션에 담긴 객체들 출력하기(모든 필드)
        System.out.println(userSet);
        
        // Set컬렉션에 담긴 객체들 출력하기(id만)
        // Set컬렉션에 담긴 객체들 출력하기(pwd만)
        for(User ele : userSet) {
           System.out.println(ele.getId());
           System.out.println(ele.getPwd());
        }
	}

}
