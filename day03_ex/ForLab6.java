package day03_ex;

public class ForLab6 {

	public static void main(String[] args) {
		final char AND = '&';
		int num = (int)(Math.random()*6)+5; //5~10
		
		for (int row = 1; row <= num; row++) {
			for (int count = 1; count <= row; count++)
				System.out.print(AND);
		    System.out.println();
		}
	}

}
