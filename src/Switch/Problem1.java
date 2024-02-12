package Switch;

public class Problem1 {
    public static void main(String[] args) {
        char vovel = 'a';
        switch (vovel)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(vovel + " Is a vovel");
                break;
            default:
                System.out.println(vovel+" Is a constant");
        }
    }
}
