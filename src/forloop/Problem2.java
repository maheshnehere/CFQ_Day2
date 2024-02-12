package forloop;

public class Problem2 {
    public static void main(String[] args) {
        int reverse = 0 ,number = 12345;

        for (;number!=0;number = number/10)

        {
            int remiander = number % 10;
            reverse = reverse * 10 + remiander;
        }
        System.out.println("The reverese number is:"+reverse);
    }
}
