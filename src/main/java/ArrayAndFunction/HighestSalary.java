
/* 3. Suppose, in a company, here are some employee salaries in an array, [35000, 25000, 28000, 32500, 44000, 32800].
Find out the 3rd highest salary.*/

package ArrayAndFunction;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HighestSalary {
    public static void main(String[] args) {
        int salary[] = {35000, 25000, 28000, 32500, 44000, 32800};
        int sort_salary,i;
        Arrays.sort(salary);
        for(i=0; i< salary.length; i++){
            System.out.println(salary[i]);

        }
        System.out.println("\nThe 3rd highest salary is: "+ salary[salary.length-3]);


    }
}
