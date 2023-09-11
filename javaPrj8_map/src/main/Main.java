package main;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("set 컬렉션");
		
		// 여러 개의 객체를 관리할 컬렉션 생성
		Map menuMap = new HashMap();
		// 메뉴 객체를 여러개 만들고, 위에서 만든 컬렉션에 담기
		menuMap.put(1, new Menu("아메리카노", 3000));
		menuMap.put(2, new Menu("카페라떼", 4000));
		menuMap.put(3, new Menu("카푸치노", 5000));
		menuMap.put(4, new Menu("얼그레이", 6000));
		
		// 컬렉션에 들어있는 여러 개의 객체 전부 출력(모든 필드)
		System.out.println(menuMap);
		
		// 여러 개의 객체 전부다 출력(name필드만)
		for(int i=0; i<menuMap.size(); i++) {
			Menu x = (Menu)menuMap.get(i+1);
			System.out.println(x.getName());
		}
		
		// 여러 개의 객체 전부다 출력(price필드만)
		for(int i=0; i<menuMap.size(); i++) {
			Menu x = (Menu)menuMap.get(i+1);
			System.out.println(x.getPrice());
		}
	}

}
