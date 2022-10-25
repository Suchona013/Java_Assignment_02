
/* 2. Input an amount from the user and find out the number of notes from input amount in given
array [1000,500,100,50,20,10,5,2,1].*/

package ArrayAndFunction;

import java.lang.reflect.Array;
import java.util.Scanner;

public class NumberOfNotes {
    public static void main(String[] args) {
        System.out.println("Enter amount ");
        Scanner input = new Scanner(System.in);
        int tk = input.nextInt();
        int a[]= {1000,500,100,50,20,10,5,2,1};
        int i, count=0;
        int temp=tk;
        for(i=0;i<9;i++)
        {
           // printf("\n%d notes is:%d",a[i],temp/a[i]);
            if(temp!=0){
                System.out.println("\n%d notes is:%d"+a[i] + "\t\t" + temp/a[i]);
                temp=temp%a[i];
            }




        }
    }
}
