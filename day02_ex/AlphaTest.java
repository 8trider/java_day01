package day02_ex;

public class AlphaTest {

	public static void main(String[] args) {
		int num = (int)(Math.random()*26)+1; // 1~26
		char alphabet = (char)(num + 64); // 아스키코드 변환
		System.out.println("추출된 숫자 : "+num);
		System.out.println(alphabet);

	}

}
