import java.util.Scanner;

public class Menu {

    public void menuRunner() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu::");
        System.out.println("===========");
        System.out.println("1. Idly: 2 Pieces, 20rs");
        System.out.println("2. Dosa: 1 Pieces, 35rs");
        System.out.println("3. Vada: 2 Pieces, 15rs");
        System.out.println("4. Rice Bath: 1 Plate, 35rs");
        System.out.println("5. Chitranna: 1 Plate, 30rs");
        System.out.println("6. Puliyogare: 1 Plate, 30rs");
        System.out.println("===========");
        System.out.println("Enter your choice::");

        int choice = scanner.nextInt();

        Continue cont = new Continue();

        switch (choice) {
            case 1:
                System.out.println("You have ordered idly(2pcs) - 20rs");
                cont.continueOrdering();
                break;
            case 2:
                System.out.println("You have ordered dosa(1pc) - 35rs");
                cont.continueOrdering();
                break;
            case 3:
                System.out.println("You have ordered vada(2pcs) - 15rs");
                cont.continueOrdering();
                break;
            case 4:
                System.out.println("You have ordered rice bath(1plate) - 35rs");
                cont.continueOrdering();
                break;
            case 5:
                System.out.println("You have ordered chitranna(1plate) - 30rs");
                cont.continueOrdering();
                break;
            case 6:
                System.out.println("You have ordered puliyogare(1plate) - 30rs");
                cont.continueOrdering();
                break;
            default:
                System.out.println("Incorrect input!!! Please re-enter choice from our menu");
                menuRunner();
        }
    }

}
