package chap06;

public class Computer {
	int sum1(int[] values) {
		int sum = 0;
		for(int i =0; i<values.length; i++) {
			sum += values[i];
		}
		return sum; // 매개변수를 모를때 int[]배열로 만들어서 values값을 전부 실행
	}
	
	int sum2(int ... values) {
		int sum = 0;
		for(int i = 0; i <values.length; i++) {
			sum+= values[i];
		}
		return sum; // 매개변수를 모를때 배열로 만들지 않고 values라는 값앞에 ...이라는 문구를 사용
	}
}
