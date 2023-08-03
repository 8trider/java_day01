package day02_ex;

public class ForLab4 {

	public static void main(String[] args) {
		int evenNum = 0;
		int oddNum = 0;
		
		for (int n = 0 ; n <= 100; n += 2)
			evenNum += n;
		for (int n = 1 ; n <= 100; n += 2)
			oddNum += n;
		
//		 for (int num = 1; num <= 100; num++) {
//			 if (num % 2 == 0 ) {
//				 evenNum += num;
//			 }
//			 else {
//				 oddNum += num;
//			 }
//		 }
		
		
		System.out.println("1부터 100까지의 숫자들 중에서");
		System.out.println("짝수의 합은 "+evenNum+" 이고");
		System.out.println("홀수의 합은 "+oddNum+" 이다.");
	}

}

