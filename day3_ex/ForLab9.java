package day3_ex;

public class ForLab9 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*2)+1; // 1~2
		
		if (num == 1) {
			for(num = 1; num <= 9; num += 2) {
				for(int dan=1; dan <= 9; dan++)
					System.out.print(num + "x" + dan + "=" + num*dan + "\t");		
				System.out.println();
			}
		} else {
			for(num = 2; num <= 9; num += 2) {
				for(int dan=1; dan <= 9; dan++)
					System.out.print(num + "x" + dan + "=" + num*dan + "\t");		
				System.out.println();
			}
		}
	}
}
