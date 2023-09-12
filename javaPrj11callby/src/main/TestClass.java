package main;

public class TestClass {
	
	public void method01() {
		System.out.println("method01 시작");
		Person p = new Person();
		p.age = 20;
		method02(p);
		System.out.println(p.age);
	}
	
	public void method02(Person abc) {
		System.out.println("method02 시작");
		abc.age = 10;
	}
}
