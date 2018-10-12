import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a positive number");

        int amountOfElementsToScan = in.nextInt();

        if (amountOfElementsToScan <=0) {
            System.out.println("That not a positive number!");
            return;
        }

        System.out.println("Enter" + amountOfElementsToScan + "numbers");
        int sum = 0;
        for (int i = 0; i <amountOfElementsToScan; i++) {
            sum = sum + in.nextInt();
        }
        System.out.println(sum);
    }

}
