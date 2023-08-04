package day04_ex;

public class LottoMachine {

	public static void main(String[] args) {
		int lotto[] = new int[6];
		int i = 0;
		
		while (i < 6) {
	       lotto[i] = (int) (Math.random() * 45) + 1;
	  
	       for (int j = 0; j < i; j++) {
	    	   if (lotto[j] == lotto[i]) {
	    		   i--;	
	    	       break;
	    	   }
	       }
	       i++;  
		}
		
		System.out.print("오늘의 로또 번호 - ");
		for (int k = 0; k < lotto.length; k++) {
	        System.out.print(lotto[k]);
	        if (k<lotto.length-1)
				System.out.print(",");
	    }

		}
	}


