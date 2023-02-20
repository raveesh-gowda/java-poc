import java.util.Objects;
import java.util.Scanner;

public class Continue {

    public void continueOrdering() {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();

        System.out.println("===========");
        System.out.println("Do you want to order anything else?");
        System.out.println("Enter 'y' to continue.");
        System.out.println("Enter 'n' to exit.");
        System.out.println("===========");

        String continueChoice = scanner.next();

        if (Objects.equals(continueChoice, "Y") || Objects.equals(continueChoice, "y")) {
            menu.menuRunner();
        } else if (Objects.equals(continueChoice, "N") || Objects.equals(continueChoice, "n")) {
            System.out.println("Thanks for ordering from our App. Visit again!!!");
            System.exit(0);
        }
    }

}
