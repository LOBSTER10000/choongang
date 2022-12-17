package thisisjava;

import java.util.Scanner;
public class Study{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int[] dan;
        boolean run = true;
        while(run){
        	a = scan.nextInt();
           
        	dan = new int[a];
            for(int i = 1; i <= 9; i++){
                for(int j = 1; j <= dan.length; j++){
                    System.out.println(i + "x" + j + "=" + (i*j));
                }
                System.out.print("");
                run = false;
            }
        }
    }
}