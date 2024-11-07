package BasicQue;

import java.util.Scanner;

public class ArmstrongNo {

    // Method to count the number of digits in a number
    public static int countDigit(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int n) {
        int digits = countDigit(n);
        int sum = 0;
        int temp = n;

        while (temp > 0) {
            int remainder = temp % 10;
            sum += Math.pow(remainder, digits);
            temp /= 10;
        }

        return sum == n;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        s.close();

        if (isArmstrong(n)) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}
