package main;

import java.util.ArrayList;
import java.util.List;

import menu.Menu;

public class Main {

	public static void main(String[] args) {
		System.out.println("복습 어게인");
		
		//여러 개의 객체를 관리할 컬렉션 생성
		List menuList = new ArrayList();
		// 메뉴 객체를 여러개 만들고, 위에서 만든 컬렉션에 담기
		menuList.add(new Menu("아메리카노", 3000));
		menuList.add(new Menu("카페라떼", 4000));
		menuList.add(new Menu("바닐라라떼", 5000));
		menuList.add(new Menu("얼그레이티", 6000));
		
		// 컬렉션에 들어있는 여러 개의 객체 전부 출력(모든 필드)
		for(int i=0; i<menuList.size(); i++) {
			System.out.println(menuList);
		}
		
		// 여러 개의 객체 전부다 출력(name필드만)
		for(int i=0; i<menuList.size(); i++) {
			Menu x = (Menu)menuList.get(i);
			System.out.println(x.getName());
		}
		
		
		// 여러 개의 객체 전부다 출력(price필드만)
		for(int i=0; i<menuList.size(); i++) {
			Menu x = (Menu)menuList.get(i);
			System.out.println(x.getPrice());
		}
	}

}
