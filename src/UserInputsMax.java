import java.util.Scanner;

public class UserInputsMax {

    public static void main(String[] args) {

        int counter = 0;
        int max = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some numbers: ");

        while (counter < 5) {

            int temp = sc.nextInt();
            if (temp > 0) {
                counter++;
                if (temp > max) {
                    max = temp;
                }
            }

        } System.out.println(max);

    }
}
