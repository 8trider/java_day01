package day5;

class MyObject {
}

class MyObject2 {
	public String toString() {
		return "MyObject2 클래스의 객체입니다. 오버라이딩";
	}
}

class MyObject3 {
	public String toString() {
		return super.toString() +"\nMyObject3 클래스의 객체입니다. 오버라이딩";
	}
}

public class MyObjectTest {

	public static void main(String[] args) {
		MyObject obj = new MyObject();
		System.out.println(obj.toString()); // toString 상속 받음
		System.out.println(obj);
		
		java.util.Date d = new java.util.Date();
		System.out.println(d);
		
		MyObject2 obj2 = new MyObject2();
		System.out.println(obj2);
		
		MyObject3 obj3 = new MyObject3();
		System.out.println(obj3);
	}

}
