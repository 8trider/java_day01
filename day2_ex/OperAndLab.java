package day2_ex;

public class OperAndLab {

	public static void main(String[] args) {
		int grade = (int)(Math.random() * 6) + 1; // 1~6
		if(grade >= 1 && grade < 4)		
			System.out.println(grade+"학년은 저학년입니다.");
		if(grade >= 4 && grade < 7)		// else 처리 가능
			System.out.println(grade+"학년은 고학년입니다.");
		}

}
