package day02_ex;

public class ForLab3 {

	public static void main(String[] args) {
		int X = (int)(Math.random() * 10) + 1; // 1~10
		int Y = (int)(Math.random() * 11) + 30; //30~40
		int evenNum = 0;
		
		if (X%2==0) {
			for (int n = X ; n <= Y; n += 2)
				evenNum += n;
			} // X가 짝수라면
		
		else {
			for (int n = X+1 ; n <= Y; n += 2)
				evenNum += n;
			} // X가 홀수라면
		
		
//		for (int num = X; num <= Y; num++) {
//			if (num % 2 == 0) {
//				evenNum += num;
//			}
//		}
		
		System.out.println(X+" 부터 "+Y+" 까지의 짝수의 합 : "+evenNum);
	}

}

