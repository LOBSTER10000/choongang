package chap01;

import java.util.Scanner;

public class Bank1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		while(run) {
			System.out.println("---------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("---------------");
			System.out.println("선택 >");
			int money = 0;
			int selectNum = 0;
			selectNum = scan.nextInt();
			if(selectNum == 1) {
				System.out.println("예금 >");
				
				money = scan.nextInt();
				balance += money; 
				
			}
			else if(selectNum == 2) {
				System.out.println("출금 >");
				money = scan.nextInt();
				balance -= money; 
				}
			else if(selectNum == 3) {
				System.out.println("잔고 >");
				System.out.println(balance);
				
			}
			else if(selectNum==4) {
				System.out.println("프로그램 종료");
				run =false;
			}
			
		}
		
		

	}

}
