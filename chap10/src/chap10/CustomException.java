package chap10;

public class CustomException extends RuntimeException{
	//1. 매개변수가 없는 기본 생성자
	CustomException(){}
	
	//2. 예외 발생 원인(에외메세지)을 전달하기 위해 String 타입의 매개변수를 갖는 생성자
	CustomException(String message){
		super(message); // RuntimeExcpetion 생성자를 호출한다.
	}
}
