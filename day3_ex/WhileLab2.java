package day3_ex;

public class WhileLab2 {

	public static void main(String[] args) {
		int pairNum1, pairNum2;  // 반복문 밖에서 변수를 지정해놓고, 반복문 안에서 랜덤값을 구현한다.
		
		while (true) {
			pairNum1 = (int)(Math.random() * 6)+1; // 1~6
			pairNum2 = (int)(Math.random() * 6)+1; // 1~6	
			
			if(pairNum1 == pairNum2) {
				System.out.println("게임 끝");
				break;
			} else if (pairNum1 > pairNum2) {
				System.out.println("pairNum1이 pairNum2 보다 크다.");
				break;
	        } else {
		    	System.out.println("pairNum1이 pairNum2 보다 작다.");
				break;
		    }
		}

	}

}
