package day1;

public class OperTest6 {

	public static void main(String[] args) {
		int num1=100, num2=50;
		
		System.out.println(num1+num2); // 150
		System.out.println(num1-num2); // 50
		System.out.println(num1*num2); // 5000
		System.out.println(num1/num2); // 2
		System.out.println(num1%num2); // 0
		
		System.out.println(num1>num2); // 1
		System.out.println(num1<num2); // 0
		System.out.println(num1==num2); // 0
		System.out.println(num1!=num2); // 1
		
		System.out.println(num1>0 && num2>0); // 1
		System.out.println(num1>0 && num2==0); // 0
		
		System.out.println(num1>0 || num2>0); // 1
		System.out.println(num1>0 || num2==0); // 1
		
		System.out.println(num1 + 10 > 110 && num2 % 2 == 0); // 0
		System.out.println(num1>0 && num2 % 2 == 1); // 0

	}

}
