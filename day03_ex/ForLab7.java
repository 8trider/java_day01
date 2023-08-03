package day03_ex;

public class ForLab7 {

	public static void main(String[] args) {
		final char DECO = '*';
		for (int row = 7; row >= 1; row--) {
			for (int count = 1; count <= row; count++)
				System.out.print(DECO);
		    System.out.println();
		}

	}

}
