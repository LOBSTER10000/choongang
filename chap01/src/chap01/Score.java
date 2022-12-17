package chap01;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int student = 0;
		int[] score = null;
		boolean run = true;
		while (run) {
			int sel = 0;
			System.out.println("-------------------");
			System.out.println("1.학생 수 2. 점수 입력 3. 점수리스트 4. 분석 5. 종료");
			System.out.println("-------------------");
			System.out.println("선택 >");
			sel = scan.nextInt();
			if (sel == 1) {
				System.out.print("학생수 입력 >");
				student = scan.nextInt();
				score = new int[student];

			} else if (sel == 2) {
				System.out.print("점수 입력 >");
				for (int i = 0; i < score.length; i++) {
					score[i] = scan.nextInt();
					System.out.println("score[" +i +"] = " + score[i]);
				}
			} else if (sel == 3) {
				for (int i = 0; i < score.length; i++) {
					System.out.println("score[" +i +"] = " + score[i]);
				}

			} else if (sel == 4) {
				int sum = 0;
				int max = score[0];
				double avg = 0;
				for(int j = 0 ; j < score.length; j++ ) {
					if( max <score[j]) {
						max = score[j];
					}
				}
				
				for (int i = 0; i < score.length; i++) {
					sum += score[i];
					
				}
				avg = (double) sum / score.length;
				System.out.println(max);
				System.out.println(avg);
			}
			else if (sel ==5) {
				System.out.println("프로그램 종료");
				run =false;
			}
		}

	}
}
