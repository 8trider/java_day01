package day03_ex;

public class ControlLab3 {

	public static void main(String[] args) {
		int num;
		
		while (true) {
			num = (int)(Math.random()*120+1);
			if (num < 50) {
				System.out.printf("%d : 50 미만\n", num);
//				switch (X)	// if 대신 switch 적용
//				case 3: case 13: case 23: case 33: case 43:
//				if (num==3||num==13||num==23||num==33||num==43) 
				if (num%10==3){
					System.out.printf("%d : *듀크팀*\n", num);
				}
			}
			else if (num >= 50 && num <= 80) {
				System.out.printf("%d : 50 이상 80 이하\n", num);
				if (num >= 70 && num <= 79) {
					System.out.printf("%d : *턱시팀*\n",num);
				}
			}
			else if (num >= 81 && num <= 100) {
				continue;
			}
			else
				break;
		}	
	}

}
