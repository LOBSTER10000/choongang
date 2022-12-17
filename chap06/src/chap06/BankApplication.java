package chap06;

import java.util.Scanner;

public class BankApplication {

		private static Account1[] accountArray = new Account1[100];
		private static Scanner scan = new Scanner(System.in);
		
		public static void main(String[] args) {
			boolean run = true;
			while(run) {
				System.out.println("--------------------");
				System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
				System.out.println("--------------------");
				System.out.println("선택> ");
				
				int selectNo = scan.nextInt();
				
				if(selectNo == 1) {
					createAccount();
				} else if(selectNo == 2) {
					accountList();
				} else if(selectNo == 3) {
					deposit();
				} else if(selectNo == 4) {
					withdraw();
				} else if(selectNo == 5) {
					run = false;
				}
			}
			System.out.println("프로그램 종료");
		

	}
		
		//계좌 생성하기
		
		private static void createAccount() {
			 System.out.println("----------");
			 System.out.println("계좌생성");
			 System.out.println("----------");
			 
			 System.out.println("계좌번호: ");
			 String ano = scan.next();
			 System.out.println("계좌주: ");
			 String owner = scan.next();
			 System.out.println("초기입금액: ");
			 int balance = scan.nextInt();
			 
			 
			 Account1 newAccount = new Account1(ano, owner, balance);
			 for(int i = 0; i < accountArray.length; i++) {
				 if(accountArray[i] == null) {
					 accountArray[i] = newAccount;
					 System.out.println("계좌를 생성하는 중입니다.");
					 break;
				 }
			 }
		}
		
		//계좌 목록 보기
		
		private static void accountList() {
			System.out.println("--------------");
			System.out.println("계좌목록");
			System.out.println("--------------");
			for(int i=0; i<accountArray.length; i++) {
				Account1 account = accountArray[i];
				if(account != null) {
					System.out.print(account.getAno());
					System.out.print("     ");
					System.out.print(account.getOwner());
					System.out.print("     ");
					System.out.print(account.getBalance());
					System.out.println();
				}
			}
		}
		
		// 예금하기
		
		private static void deposit() {
			 System.out.println("----------");
			 System.out.println("예금");
			 System.out.println("----------");
			 System.out.println("계좌번호");
			 String ano = scan.next();
			 System.out.println("예금액");
			 int money = scan.nextInt();
			 Account1 account = findAccount(ano);
			 if(account == null) {
				 System.out.println();
				 return;
			 }
			 account.setBalance(account.getBalance() + money);
			 System.out.println("예금이 성공했습니다.");
		}
		
		//출금하기 
		
		private static void withdraw() {
			System.out.println("----------");
			 System.out.println("출금");
			 System.out.println("----------");
			 System.out.println("계좌번호");
			 accountList();
			 
			 System.out.println("출금액");
		}
		
		//Account1 배열에서 ano와 동일한 account1 객체 찾기

		private static Account1 findAccount(String ano) {
			Account1 account = null;
			for(int i = 0; i<accountArray.length; i++) {
				String dbAno = accountArray[i].getAno();
				if(dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
			return account;
		}
}
