
/*6. Suppose a software system excepts valid credentials from user to logged in to the system.
if the user inputs wrong password for 3 times, system will say that "Your user has been temporary locked".
Let the username: admin, password: adm1n*/

package ArrayAndFunction;

import java.util.Scanner;

public class Auth {
    public static void main(String[] args) {
        String myUsername;
        String myPassword;

        myUsername = "admin";
        myPassword = "adm1n";

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.println("\nEnter Username : ");
            String username = input.nextLine();

            System.out.println("\nEnter Password : ");
            String password = input.nextLine();

            if (username.equals(myUsername) && password.equals(myPassword)) {
                System.out.println("\nAccess Granted! Welcome!");
            } else if (username.equals(myUsername)) {
                System.out.println("\nInvalid Password!");
            } else if (password.equals(myPassword)) {
                System.out.println("\nInvalid Username!");
            } else {
                System.out.println("\nInvalid Username & Password!");
            }
        }
        System.out.println("Your are temporary locked");

    }
}
