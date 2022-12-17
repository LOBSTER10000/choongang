package chap06;

public class Account1 {
	private String ano;
	private String owner;
	private int balance;
	
	public Account1(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno() {return ano;} // ano 계좌번호
	public void setAno(String ano) {this.ano = ano;}
	public String getOwner() {return owner;} // 계좌 주인
	public void setOwner(String owner) {this.owner = owner;}
	public int getBalance() {return balance;} // 잔고
	public void setBalance(int balance) {this.balance = balance;}
 	}

