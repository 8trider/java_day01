package day7;

public class InputTest {

	public static void main(String[] args) throws Exception {
		System.out.print("입력 : ");
//		int input = System.in.read(); // 한 문자(1byte)만 읽는다.
		int input = new java.io.InputStreamReader(System.in).read(); // 한글 한문자도 인식 된다.
		System.out.println((char)input);

	}

}
// 요즘은 스캐너 쓰면 된다.