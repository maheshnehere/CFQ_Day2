package While;

import java.util.Scanner;

public class Problem2 {


    public static void main(String[] args) {
        int reverse = 0;
        int number = 1234;
        while (number != 0) {
            int remainder = 1234 % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        System.out.println("The reverse of the given number is: " + reverse);


    }
}