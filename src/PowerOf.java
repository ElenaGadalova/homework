import java.util.Scanner;

public class PowerOf {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int power = 1;

        System.out.println("Enter first number");
        int a = s.nextInt();

        System.out.println("Enter second (positive) number");
        int b = s.nextInt();
        if (b<=0) {
            System.out.println("Error");
                    return;
            }
        for (int i = 1; i <= b ; i++) {
            power = power*a;
        }
        System.out.println(power);
    }
}
