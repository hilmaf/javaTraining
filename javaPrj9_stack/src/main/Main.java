package main;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		// 여러 개의 객체를 관리할 컬렉션 생성
		Stack menuStack = new Stack();
		// 메뉴 객체를 여러개 만들고, 위에서 만든 컬렉션에 담기
		menuStack.add(new Menu("아메리카노", 3000));
		menuStack.add(new Menu("카푸치노", 4000));
		menuStack.add(new Menu("바닐라라떼", 5000));
		menuStack.add(new Menu("얼그레이", 6000));
		// 컬렉션에 들어있는 여러 개의 객체 전부 출력(모든 필드)
		System.out.println(menuStack);
		// 여러 개의 객체 전부다 출력(name필드만)
		for(int i=0; i<menuStack.size(); i++) {
			Menu x = (Menu)menuStack.peek();
			System.out.println(x.getName());
		}
		// 여러 개의 객체 전부다 출력(price필드만)
		for(int i=0; i<menuStack.size(); i++) {
			Menu x = (Menu)menuStack.peek();
			System.out.println(x.getName());
		}
		
	}

}
