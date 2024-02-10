package While;

public class Problem1 {
    public static void main(String[] args) {
        int num =5;
        int sum =0;
        int i =1;

        while (i <= num)
        {
            sum+=i;
            System.out.println("The sum of first " + num + " natural numbers is: " + sum);
            i++;
        }
    }
}
