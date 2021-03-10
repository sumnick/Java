import javax.swing.*;
import java.util.*;

public class DesiredSalary<nickname> {
    public static final char currency = '$';

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Hello, what is your name?");
        String name = in.nextLine();
        if (name.equals("Denys")) {

            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Sorry, Man, we accept Denys only");
            System.out.println("Call Denys now, or you gonna have serious problems! You have 5 mins!");
            // 5 minutes later...
        }

        // Ask Denys about his desired salary

        System.out.print("So, what is your desired salary in " + currency + "?");
        int desiredSalary = in.nextInt();

        int budget = 1999; //available budget on this position
        while (desiredSalary < budget) {

            desiredSalary++;


        }
        System.out.println("Sorry, nothing we can do! Only if you agreed on: " + desiredSalary + currency);

        }
    }


