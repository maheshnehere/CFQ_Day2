package CFQ;

//Read a single Digit Number and write in word


import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if (num >= 0 && num <= 9) {
            System.out.println(num + ": is a single digit number");
        }
            else if (num >= 10 && num <= 100) {
            System.out.println(num + ":is a double digit number");
        }
                else if ( num > 100 && num < 1000)
                {
                    System.out.println(num+":is a triple digit number");
                }

        else {
            System.out.println("Invalid number");
        }



    }
}
