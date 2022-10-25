
/*
4. Create your todays bazar list/pocket expenditure which includes the item name and price.
Then create a function named searchItem(String item) which will be used to search any item from your HashMap
and return the price. If found no item, then print message as "No item found" and
create another function named totalSum() which will return total price of items.*/

package ArrayAndFunction;

import java.util.HashMap;
import java.util.Scanner;

public class BazarList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your products name: ");

        String itemsName = input.nextLine();

        searchItem(itemsName);

    }

    public static void searchItem(String itemsName) {
        HashMap<String, Integer> itemsList = new HashMap<>();

        itemsList.put("Potato", 35);
        itemsList.put("Onion", 45);
        itemsList.put("Cucumber", 30);
        itemsList.put("Egg", 25);

        int result = 0;

        if (itemsList.containsKey(itemsName)) {
            result = itemsList.get(itemsName);
            System.out.println("Items price: " + result);
        } else {
            System.out.println("No items found");
        }
    }
}
