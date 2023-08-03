package day03_ex;

public class ForLab8 {

	public static void main(String[] args) {
		final char DECO = '*';
		
		for (int row = 1; row <= 5; row++) {
			for (int count = 1; count <= row; count++) 
				System.out.print(" ");
			for (int count = 1; count <= 10; count++) {
				System.out.print(DECO);
			}
		        System.out.println();
		}

	}

}
