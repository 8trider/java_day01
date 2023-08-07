package day4_ex;

public class ArrayLab4 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+5;
		
		int random[] = new int[num];	
		for(int i=0; i < random.length; i++) {	
			random[i] = (int)(Math.random()*26)+1;
		}
		
		char letters[] = new char[num];
		for(int j=0; j < letters.length; j++) {	
			letters[j] = (char)(random[j]+96);;
		}

		for (int k=0; k<random.length; k++) {
			System.out.print(random[k]); 
			if (k<random.length-1)
			System.out.print(",");
			
//			if(k != random.length-1) {
//				System.out.print(",");	
//			} else {
//				System.out.println();
//			}			
		}
		System.out.println();
		for (int l=0; l<letters.length; l++) {
			System.out.print(letters[l]); 
			if (l<random.length-1)
			System.out.print(",");
		}
	}
}
/*
1. ArrayLab4 이라는 클래스를 생성한다.
2. 5부터 10사이의 난수를 추출한다.
3. 추출된 난수값을 크기로 갖는 int 타입의 배열을 생성한 후에 이 배열의 
   각각의 원소값으로 1부터 26 사이의 난수를 추출하여 저장한다.
4. 3에서 생성된 int 타입의 배열과 동일한 크기를 갖는 char 타입의 배열을 생성한다.
5. int 타입의 배열에 저장된 각각의 원소값을 이용하여 char 타입의 배열에
    알파벳 소문자를 원소값으로 저장하는데 1이면 'a', 2 이면 'b', ... 26이면 'z'를 저장한다.
6. 두 배열의 원소값을 다음과 같이 출력한다.

    [ 출력형식 ]

    10,1,3,21,6,8,11,26,22,19
    j,a,c,u,f,h,k,z,v,s
*/