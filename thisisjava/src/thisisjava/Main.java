package thisisjava;


import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] A;
        int N = 0;
        int X = 0;
        int min;
        System.out.println("수열 a의 개수");
        N = scan.nextInt();
        System.out.println("주어지는 수의 숫자");
        X = scan.nextInt();
        A = new int[N];
        for(int i = 0; i < A.length ; i++){
        	System.out.println("수열 A의 값");
        	A[i] = scan.nextInt();
            if(A[i] < X){
                
                min = A[i];
                System.out.println(min);
            }
            
        }
    }
}