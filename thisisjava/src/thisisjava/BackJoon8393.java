package thisisjava;

import java.util.Scanner;
public class BackJoon8393{
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
        boolean run =true;
        int a = 0;
        int sum = 0;
        while(run) {
            a = scan.nextInt();
        for(int i = 0; i <= a ; i++){
            sum = i + sum;
        }
        System.out.println(sum);
        run = false;
    }
}
}
