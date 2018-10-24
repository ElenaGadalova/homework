import java.util.Scanner;

//        Read numbers as long as user will input 5 numbers greater than 0 and than print the largest and smallest of them.
//        Please handle negative values properly.

public class UserInputsMax {

    public static void main(String[] args) {

        int counter = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;



        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some numbers: ");


        while (counter < 5) {

            int temp = sc.nextInt();

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


    }

    public static void MinValue () {

    }
}
