package day03_ex;

public class WhileLab3 {

	public static void main(String[] args) {
			
			int count = 0;
			int num;
			
			while(true) {
				num = (int)(Math.random()*31);
				if (num == 0 | num > 26) {
					System.out.println("출력횟수는 "+count+" 번입니다");
					break;	
				} else {
					System.out.printf("%d-%c, %2$d, 0x%2$x\n", num, num+64);
					count++;
				}		
			}
	}

}
