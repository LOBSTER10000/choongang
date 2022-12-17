package thisisjava;

import java.util.Scanner;
public class BackJoon10950{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int c = 0;
        c = scan.nextInt();
        for(int i =0; i< c; i++) {
        	int a = 0;
            int b = 0;
        	a = scan.nextInt();
        	b = scan.nextInt();
        	System.out.println(a+b);
        }
    }
}
