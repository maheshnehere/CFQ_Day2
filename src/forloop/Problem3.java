package forloop;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int reverse = 0;
        int temp;


        temp = number;
        while (number > 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;


        }

        if (temp == reverse)
        {
            System.out.println("The number is palindrome"+number);
        }
        else {
            System.out.println("The number is not palindrome: "+number);
        }
        //System.out.println();
    }
}
