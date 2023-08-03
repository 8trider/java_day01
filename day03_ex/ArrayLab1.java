package day03_ex;

public class ArrayLab1 {

	public static void main(String[] args) {
		int ary[] = new int[10];
		for (int i=0; i<ary.length; i++)
			System.out.print(ary[i]+" ");
		
		for (int i=0; i < ary.length; i++)
            ary[i] = (i+1)*10;
		System.out.println();
		System.out.println("첫 번째 : "+ary[0]);
		System.out.println("마지막 : "+ary[ary.length-1]);
		System.out.println("합 : "+(ary[0]+ary[ary.length-1]));
		
		for (int i=0; i<ary.length; i++)
			System.out.print(ary[i]+" ");
		
		System.out.println();
		for(int j=ary.length-1; j>=0; j--)
			System.out.print(ary[j]+" ");
		
		System.out.println();
		for (int k=1; k<ary.length; k+=2)
			System.out.print(ary[k]+" ");
	}

}
