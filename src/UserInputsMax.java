import java.util.Scanner;


    // Read numbers as long as user will input 5 numbers greater than 0 and 5 numbers smaller than 0 and then print their sum.


public class UserInputsMax {

    public static void main(String[] args) {

        int counter = 0;
        int counter2 = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some numbers: ");

        while (counter < 5 && counter2<5) {

            int temp = sc.nextInt();
            sum += temp;

            if (temp > 0) {
                counter++;
                if (temp > max) {
                    max = temp;
                }
             } if (temp<min)
                min=temp;
        }


        System.out.println("MAX VALUE = " + max);
        System.out.println("MIN VALUE = " + min);
        System.out.println("SUM of elements = " + sum);
    }
}

