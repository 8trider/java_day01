package day04_ex;

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
