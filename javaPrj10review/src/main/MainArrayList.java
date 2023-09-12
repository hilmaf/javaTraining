package main;

import java.util.ArrayList;
import java.util.List;

public class MainArrayList {

	public static void main(String[] args) {
		
		// User 객체 여러 개를 받을 컬렉션 생성
		List<User> userList = new ArrayList<User>();
		
		// 컬렉션에 객체 담기
		userList.add(new User("혼또니", "1234"));
		userList.add(new User("수갱스터", "5678"));
		userList.add(new User("걸리버", "9876"));
		
		// 컬렉션에 담긴 객체들의 모든 필드 출력하기
		System.out.println(userList);
		
		// userList에 담긴 객체들의 id 필드 출력하기
		for(User ele : userList) {
			System.out.println(ele.getId());
			System.out.println(ele.getPwd());
		} // => 향상된 for문
		
//		User ele = userList.get(0);
//		System.out.println(ele.getId());
//		System.out.println(ele.getPwd());
	}

}
