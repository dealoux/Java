import java.util.Scanner; // import Java built in scanner util

public class PasswordPrompt {
    /* main() function to execute the program */
    public static void main (String[] args)
    {
        prompt();
    }

    /* prompt() function acts as the main function of this program */
    private static void prompt()
    {
        Scanner scanner = new Scanner(System.in); // using java built in scanner to scan the user input
        String username = ""; // a default blank variable to store the user input, in this case the username
        String password = ""; // a default blank variable to store the user input, in this case the password
        int minLength = 8; // minimum required length of the password, in this case 8

        System.out.print("Enter a user name: "); // prompt the user for their username
        username = scanner.nextLine(); // store the username

        /* use a while loop to prompt the user for a valid password */
        while(password.length() < minLength)
        {
            System.out.print("Enter a password that is at least 8 characters: ");
            password = scanner.nextLine();
        }

        /* display the result */
        System.out.print("Your user name is " + username.toLowerCase() + " and your password is " + password.toLowerCase());
    }
}
