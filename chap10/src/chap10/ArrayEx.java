package chap10;

public class ArrayEx {
	public static void main(String[] args) {
		
		String arr[] = {"가", "나", "다"};
		try {
		for (int i = 0; i< 5; i++) {
			System.out.println(arr[i]);
		}} 
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스범위 초과");
		}
	}
}
