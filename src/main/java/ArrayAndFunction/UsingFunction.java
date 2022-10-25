
/*5. Take 5 numbers from users in an array. Then find out the average number,
how many even and how many odd numbers using these functions: average(), countEvenNumbers(), countOddNumbers().*/

package ArrayAndFunction;

import java.util.Scanner;

public class UsingFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        double array[] = new double[5];

        System.out.println("Enter 5 elements one by one:");

        average(input, total, array);
        countEvenNumbers(array);
        countOddNumbers(array);
    }

    public static void average(Scanner input, double total, double[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }

        for (int j = 0; j < array.length; j++) {
            total += array[j];
        }

        double average = total / 5;

        System.out.println("The average value is: " + average);

        input.close();
    }


    public static void countEvenNumbers(double[] array) {

        int evenCount = 0;

        for (int e = 0; e < array.length; e++) {
            if (array[e] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("even number " + evenCount);
    }

    public static void countOddNumbers(double[] array) {
        int oddCount = 0;

        for (int d = 0; d < array.length; d++) {
            if (array[d] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("odd number " + oddCount);


    }
}
