import java.util.*;

public class DesiredSalaryV2 {

    public static void main(String[] args) {

        String name;

        Scanner in = new Scanner(System.in);

        System.out.println("Call your name, Dude!");

        name = in.nextLine();

        if (!name.equals("Denys"))

            do {

            System.out.println("Call your name once again, Dude!");

            name = in.nextLine();
        }

        while (!name.equals("Denys"));

        System.out.println("Hello, Denys! Glad to see you!");

        System.out.println("Lets discuss details");

        System.out.println("What are your salary expectations?");

        System.out.println("Enter desired amount in $?");

        new Scanner(System.in);

        int amount = in.nextInt();

        int budget = 1999;

        if (amount < budget) {

            System.out.println("Hey, you deserve more!");

            System.out.println("Enter correct amount this time!");

        } else if (amount > budget) {

            System.out.println("NO!NO!NO! " + " This is too much!");

        } else {

            System.out.println("Great guess! You're Hired!");

        }
    }
}










