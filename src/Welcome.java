import java.util.Scanner;

public class Welcome {
    private String name;

    public void greet() {
        System.out.println("Welcome to Menu Driven Application.");
    }

    public void getName() {
        System.out.println("Please enter your name");
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
    }

    public void greetWithName() {
        System.out.println("Hi there, " + name.toUpperCase());
    }

}
