package day3_ex;

public class ForLab5 {

	public static void main(String[] args) {
		int random1 = (int)(Math.random() * 8)+3; // 3~10
		int random2 = (int)(Math.random() * 3)+1; // 1~3
		
		switch (random2) {
		case 1:
			for (int count = 1; count <= random1; count++)
				System.out.print('*');
			break;
		case 2:
			for (int count = 1; count <= random1; count++)
				System.out.print('$');
			break;
		case 3:
			for (int count = 1; count <= random1; count++)
				System.out.print('#');
		}
	}
}
