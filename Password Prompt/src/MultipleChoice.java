import java.util.Scanner; // import Java built in scanner util

public class MultipleChoice {
    /* main() function to execute the program */
    public static void main (String[] args)
    {
        multipleChoice();
    }

    /* multipleChoice() function acts as the main function of this program */
    private static void multipleChoice()
    {
        /* variables for questions, customizable as needed */
        String question = "Who is the current Prime Minister of Canada"; // a variable to store the question
        String a = "Justin Timberlake"; // a variable to store the answer for choice a
        String b = "Justin Trudeau"; // a variable to store the answer for choice b
        String c = "Justin Bieber"; // a variable to store the answer for choice c
        String d = "Justin Chambers"; // a variable to store the answer for choice d
        String correctAnswerS = "b"; // a variable to store the correct answer, which is b in this case
        String correctAnswerL = b; // a variable to store the correct answer, which is "Justin Trudeau" in this case
        /* other variables */
        Scanner scanner = new Scanner(System.in); // using java built in scanner to scan the user input
        String tryAgain = "y"; // a variable to store the correct word needed to keep prompting, in this case "y"
        String userAnswer = ""; // a default variable to store the user input, in this case the answer to the question
        String userRespond = tryAgain; // a variable to store the user input, in this case their respond whether or not they would like to try again, default to "y"

        /* use a while loop to prompt the user whether or not they would like to try again */
        while(userRespond.compareToIgnoreCase(tryAgain) == 0)
        {
            /* display the question and the available choices */
            System.out.println(question); // display the question
            System.out.println("a. " + a); // display choice a and its answer
            System.out.println("b. " + b); // display choice b and its answer
            System.out.println("c. " + c); // display choice c and its answer
            System.out.println("d. " + d); // display choice d and its answer

            /* prompt the user for their answer and check whether it's correct or not */
            System.out.print("Enter your choice: ");
            userAnswer = scanner.nextLine(); // store the user's answer
            if(userAnswer.compareToIgnoreCase(correctAnswerS) == 0) // if the answer is correct
            {
                System.out.println("Correct, well done!");
            }
            else if(userAnswer.compareToIgnoreCase(correctAnswerL) == 0) // else if the user would rather enter the full answer themselves
            {
                System.out.println("Correct, would rather a full answer, eh?");
            }
            else // else the answer is incorrect
            {
                System.out.println("Incorrect!");
            }

            /* prompt the user whether or not they would like to try again */
            System.out.print("Again? Press y to continue: ");
            userRespond = scanner.nextLine(); // store the user's respond
            System.out.println(); // display a blank line after each run
        }
    }
}
