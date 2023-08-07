package day5_ex;

import java.util.Scanner;

class SalaryExpr {
	int bonus;

	SalaryExpr() {
		this(0);
	}

	SalaryExpr(int bonus) {
		this.bonus = bonus;
	}

	int getSalary(int grade) {
//		if (grade == 1)
//			return bonus + 100;
//		else if (grade == 2)
//			return bonus + 90;
//		else if (grade == 3)
//			return bonus + 80;
//		else
//			return bonus + 70;

//		int result = 0;
		switch(grade) {
		case 1:
			return bonus + 100; 
//			result = bonus + 100;
//			break;
		case 2:
			return bonus + 90;
//			result = bonus + 90;
//			break;
		case 3:
			return bonus + 80;
//			result = bonus + 80;
//			break;
		default:
//			result = bonus + 70;
			return bonus + 70;	
		}
//		return result;
	}

}

public class SalaryExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("몇 월? : ");
			int month = scan.nextInt();
			if (month < 1 || month > 12) {
				System.out.println("1~12 사이 정수를 입력하세요");
				continue;
			}

			System.out.print("몇 등급? : ");
			int grade = scan.nextInt();
			if (grade < 1 || grade > 4) {
				System.out.println("1~4 사이 정수를 입력하세요");
				continue;
			}

			SalaryExpr evenMonth;
			if (month % 2 == 0) {
				evenMonth = new SalaryExpr(100);
			} else {
				evenMonth = new SalaryExpr();
			}

			System.out.println(month + "월 " + grade + "등급의 월급은 " + evenMonth.getSalary(grade) + "입니다.");

//			scan.close();
//			break;
		}
	}
}
