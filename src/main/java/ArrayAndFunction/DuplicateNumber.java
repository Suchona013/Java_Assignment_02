
/*7. Find the duplicate element in the given array. [1, 5, 2, 2, 3, 4, 3, 5, 2, 6, 7, 9, 8, 5]*/

package ArrayAndFunction;

public class DuplicateNumber {
    public static void main(String[] args) {
        int array[] = new int[]{1, 5, 2, 2, 3, 4, 3, 5, 2, 6, 7, 9, 8, 5};

        System.out.println("Duplicate elements: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                }
            }
        }
    }
}