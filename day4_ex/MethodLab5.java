package day4_ex;

public class MethodLab5 {

	public static void main(String[] args) {
		int[] ary1 = { 10, 20, 30 };
		int[] ary2 = { 100, 500, 300, 200, 400 };
		int[] ary3 = { 1, 10, 3, 4, 5, 8, 7, 6, 9, 2 };

		System.out.println("가장 큰 값은 " + maxNumArray(ary1) + " 입니다.");
		System.out.println("가장 큰 값은 " + maxNumArray(ary2) + " 입니다.");
		System.out.println("가장 큰 값은 " + maxNumArray(ary3) + " 입니다.");
	}

	static int maxNumArray(int[] n) {
		int maxNum = n[0];
		for (int i = 1; i < n.length; i++) {
			if (maxNum < n[i])
				maxNum = n[i];
		}
		return maxNum;
	}
}
/*
 * 1. 클래스명 : MethodLab5 2. 정의해야 하는 메서드 메서드명 : maxNumArray 매개변수 타입 : int[] 리턴값의
 * 타입 : int
 * 
 * 매개변수에 전달된 배열의 원소값들 중에서 가장 큰값 리턴
 * 
 * 3. main() 메서드에서 다음 배열들을 전달하여 maxNumArray() 를 3번 호출한다.
 * 
 * 배열 1 : 10, 20, 30 배열 2 : 100, 500, 300, 200, 400 배열 3 : 1, 10, 3, 4, 5, 8, 7,
 * 6, 9, 2
 * 
 * 호출하고 리턴값을 다음과 같이 출력한다.
 * 
 * 가장 큰 값은 30 입니다. 가장 큰 값은 500 입니다. 가장 큰 값은 10 입니다.
 */