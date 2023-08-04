package day03_ex;

public class ArrayLab2 { // 1. ArrayLab2 라는 클래스를 하나 만든다.

	public static void main(String[] args) {
		int[] score = new int[10];	// 2. 10개의 숫자(정수)를 저장할 수 있는 배열을 하나 만든다.
		for(int i=0; i < score.length; i++) {	// 3. 각각의 element로  4부터 20사이의 난수를 추출하여 저장한다.
			score[i] = (int)(Math.random()*17)+4;
		}
		
		System.out.print("모든 원소의 값 : ");
//		for(int data : score) {
//			System.out.print(data+ " ");  // 모든 원소의 값 : x x x x x x x x x x
//		}
		for (int j=0; j<=score.length-1; j++) { // 모든 원소의 값 : x,x,x,x,x,x,x,x,x,x
			System.out.print(score[j]);
			if (j<score.length-1)
				System.out.print(",");
		}
			
		int sum = 0;
		for(int i=0; i<=score.length-1; i++) { // 4. 모든 원소의 합을 구한다.
			sum += score[i];
		}
		System.out.println();
		System.out.println("모든 원소의 합 : "+sum); // 모든 원소의 합 : xxx

	}

}
/*
1. ArrayLab2 라는 클래스를 하나 만든다.
2. 10개의 숫자(정수)를 저장할 수 있는 배열을 하나 만든다.
3. 각각의 element로  4부터 20사이의 난수를 추출하여 저장한다.
4. 모든 원소의 합을 구한다.
5. 다음과 같은 형식으로 출력한다.

    모든 원소의 값 : x x x x x x x x x x
    모든 원소의 합 : xxx
*/