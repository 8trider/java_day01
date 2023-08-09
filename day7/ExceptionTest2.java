package day7;

public class ExceptionTest2 {
	public static void main(String[] args) {
		System.out.println("수행시작");
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int result = num1 / num2;
			System.out.println("연산 결과 : " + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("프로그램 아규먼트를 2 개 전달하세요!!");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("두번째 프로그램 아규먼트는 0이 아닌 값을 전달하세요!!");
			return;
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("프로그램 아규먼트로 숫자를 전달하세요!!");
		} catch (Exception e) {  // 가장 조상 객체이므로 모든 에러를 다 잡는다. 그래서 캐치 블럭 맨 위에 있으면 아래의 캐치 블럭들이 의미가 없기에, 가장 마지막에 붙인다.
			System.out.println("뭔가 에러가 있단다");
		} finally {
			System.out.println("항상 수행!!");
		}
		System.out.println("수행종료");
	}
}
// 전부 런타임 예외, 즉 예외처리를 안해도 된다.