package day1;
public class OperTest3 {
	public static void main(String[] args) {
		double r_num = Math.random(); 
		System.out.println(r_num);
		double r_num2 = r_num * 10;
		System.out.println(r_num2);
		int r_num3 = (int)r_num2;     
		System.out.println(r_num3); 
		System.out.println(r_num3+1); 
		int numr = (int)(Math.random()*45)+1; // 1~45
		System.out.println(numr);
	}
}
