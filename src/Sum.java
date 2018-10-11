import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 5 numbers ");
        int sum = 0;
        for (int i = 0; i <5; i++) {
            sum = sum + in.nextInt();
        }
        System.out.println(sum);
    }
}
