package BasicQue;

import java.util.*;

public class EvenOdd{

    public static void evenodd(int n){
        if(n%2==0){
           System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    evenodd(n);
    }
}