import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number to find factorial");
        int n = scan.nextInt();

            int result = 1;
            for (int i = 1; i <=n; i++) {
            result = result*i;
            }
        System.out.println(result);
    }
}
