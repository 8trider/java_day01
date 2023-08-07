package day2_ex;

public class ForLab2 {

	public static void main(String[] args) {
		int num = 9;
		for (;num>=4;num--)
			if (num % 2 == 1)
				System.out.println(num+" : 홀수");
			else 
				System.out.println(num+" : 짝수");

	}

}
