package day6;

class A {
	A() {
//		super(); // this와 super 메서드는 꼭 첫번째 행에 와야한다. 아규먼트 안받으면 자동이라 생략가능.
		System.out.println("A 클래스 객체 생성");
	}
}

class B extends A {
	B(int num) {
//		super();
		System.out.println("B 클래스 객체 생성");
	}
}

class C extends B {
	C() {
		super(10);
		System.out.println("C 클래스 객체 생성");
	}
}

public class ABCTest {

	public static void main(String[] args) {
		new C(); // C만 객체 생성되는 것이 아니라, 모든 조상이 전부 객체 생성된다.

	}

}
