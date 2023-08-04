package day04_ex;

public class ArrayLab3 {

	public static void main(String[] args) {
		char alphabet[] = {'J','a','v','a'};

		for (int i=0; i<=alphabet.length-1; i++) {
			if (alphabet[i] <= 'Z')
				alphabet[i] = (char)(alphabet[i]+32);
			else
				alphabet[i] = (char)(alphabet[i]-32);
		}
		
		//인헨스드 for로도 출력해보기
		
		for (int j=0; j<alphabet.length; j++)
			System.out.println(alphabet[j]); 
	}

}
