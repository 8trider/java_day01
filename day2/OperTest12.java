package day2;

public class OperTest12 {

	public static void main(String[] args) {
		int num = 100; // int(long), double, char, boolean
		
		System.out.println(num > 100 && ++num == 101); // false, 
		System.out.println(num);  // 101x 100o, 왜냐하면 앞의 식이 거짓이라 뒤의 식을 연산하지 않았기 때문.
		
		System.out.println(num > 100 || ++num == 101); // true
		System.out.println(num);  // 102x 101o
	}

}
