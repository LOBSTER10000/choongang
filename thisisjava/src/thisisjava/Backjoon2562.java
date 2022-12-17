package thisisjava;

import java.util.Scanner;
public class Backjoon2562 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] score;
		boolean run = true;
		int a = 0;
		int max = 0;
		int b = 0;
		score = new int[9];
		for(int i=0; i<9; i++) {
			score[i] = scan.nextInt();			
		}
		
//		for(int i=0;  i< score.length; i++){
//		score[i] = (int) (Math.floor(Math.random()*100)+1);
//		System.out.println(score[i]);
		for(int i=0; i<score.length; i++) {
			if(score[i] > max) {
				max = score[i] ;
				b = i+1;			
			}
		}
			System.out.println(max);
			System.out.println(b);
			
		}
	}