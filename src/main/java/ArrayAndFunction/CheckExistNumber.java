
/*1. Take input from a user and check if the number exists in the array.
Let the array is [1,3,5,7,2,4,6,8]*/

package ArrayAndFunction;

import java.util.Scanner;

public class CheckExistNumber {
    public static void main(String[] args) {
        int [] array = {1,3,5,7,2,4,6,8};
        int i, flag=0, index = 0;
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (i=0;i<8;i++){
            if(array[i] == number){
                flag=1;
                index= i;
            }
        }
        if(flag==1){
            System.out.println("Found in the position: " + index);
        }
        else {
            System.out.println("Found no element");
        }

    }
}
