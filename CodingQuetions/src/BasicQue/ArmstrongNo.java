package BasicQue;

import java.util.*;

public class ArmstrongNo{

    public static int countDigit(int n){
        int count=0;
        while(n<0){
            n = n/10;
            count++;
        }
        return count+1;
    }

    public static void Armstrong(int n){
        int digits = countDigit(n);
    }

    public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();


    }
}