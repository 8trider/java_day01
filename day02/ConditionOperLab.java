package day02;

public class ConditionOperLab {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 5) + 1; // 1~5
		int result;
		if (num == 1)
			result = 300 + 50;
		else if (num == 2)
			result = 300 - 50;
		else if (num == 3)
			result = 300 * 50;
		else if (num == 4)
			result = 300 / 50;
		else // (num == 5)
			result = 300 % 50;
		
		System.out.println("결과값 : "+result);

	}

}
