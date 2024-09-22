package BasicQue;

import java.util.*;

public class FibonacciSeries{

    public static void fibonacci(int n){
        int a=0,b=1;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<n;i++){
            int temp = a+b;
            a=b;
            b=temp;
        System.out.print(temp+" ");
        }

    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);
    }
}