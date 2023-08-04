package day03_ex;

public class ArrayLab1 { //1. ArrayLab1 이라는 클래스를 하나 만든다.

	public static void main(String[] args) {
		int ary[] = new int[10]; //2. ary 라는 int 타입의 배열 변수를 선언하고 10개의 엘리먼트를 갖는 배열을 생성하여 대입한다.
		for (int i=0; i<ary.length; i++)  // 3. 배열의 값들을 하나의 행에 다음 형식으로 출력한다.
			System.out.print(ary[i]+" "); // 	0 0 0 0 0 0 0 0 0 0
		
		for (int i=0; i < ary.length; i++) // 4. 생성된 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 을 각각의 element 로 저장한다.
            ary[i] = (i+1)*10;
		System.out.println();              // 5. 첫 번째 원소와 마지막 원소만 출력하고 합도 출력한다.
		System.out.println("첫 번째 : "+ary[0]); // 첫 번째 : 10
		System.out.println("마지막 : "+ary[ary.length-1]); // 마지막 : 100
		System.out.println("합 : "+(ary[0]+ary[ary.length-1])); // 합 : 110
		
		for (int i=0; i<ary.length; i++)  // 6. 배열의 값들을 하나의 행에 다음 형식으로 출력한다.
			System.out.print(ary[i]+" "); // 	10 20 30 40 50 60 70 80 90 100
		
		System.out.println();
		for (int j=ary.length-1; j>=0; j--) // 7. 배열의 값들을 하나의 행에 다음 형식으로 출력한다.(역순으로)
			System.out.print(ary[j]+" ");   // 	  100 90 80 70 60 50 40 30 20 10
		
		System.out.println();
		for (int k=1; k<ary.length; k+=2) // 8. 배열의 값들을 하나의 행에 다음 형식으로 출력한다.
			System.out.print(ary[k]+" "); // 	20 40 60 80 100
	}

}
