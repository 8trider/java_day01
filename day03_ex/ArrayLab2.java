package day03_ex;

public class ArrayLab2 {

	public static void main(String[] args) {
		int[] score = new int[10];
		for(int i=0; i < score.length; i++) {
			score[i] = (int)(Math.random()*17)+4;
		}
		
		System.out.print("모든 원소의 값 : ");
		for(int data : score) {
			System.out.print(data+ ",");
		}
		
		int sum = 0;
		for(int i=0; i<=score.length-1; i++) {
			sum += score[i];
		}
		System.out.println();
		System.out.println("모든 원소의 합 : "+sum);

	}

}
