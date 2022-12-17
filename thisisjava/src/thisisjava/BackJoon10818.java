package thisisjava;

import java.util.Scanner;
public class BackJoon10818 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] score;
		
		int a = 0;
		int min = 0;
		int max = 0;
		
			System.out.println("숫자를 몇번 반복하실건가요?");
			a = scan.nextInt();
			score = new int[a];
			for(int i=0;  i< score.length; i++){
				score[i] = (int) (Math.floor(Math.random()*100)+1);
				System.out.println(i+1 +"번째 숫자는 = " + score[i]);
				if(score[i] > max) {
					max = score[i] ;
				}
				System.out.println("최대값의 인덱스 값 :" + i);
			}
			System.out.println("최대값은 : " + max);
            System.out.println("최대값의 인덱스 값은" + score);
			
		}
	}
