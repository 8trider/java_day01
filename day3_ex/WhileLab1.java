package day3_ex;

public class WhileLab1 {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 6)+5; // 5~10
		int i = 1;
		int j = 1;
		
		System.out.println(" [ for 결과 ]");
		for (i = 1; i <= num; i++) {
			System.out.println(i+" -> "+i*i);
		}
		
		System.out.println(" [ while 결과 ]");
		while (j <= num) {
			System.out.println(j+" -> "+j*j);
			j+=1; //j++;
		}
	}

}


