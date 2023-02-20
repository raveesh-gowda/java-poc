public class ApplicationRunner {

    public static void main(String[] args) {
        Welcome welcome = new Welcome();
        welcome.greet();
        welcome.getName();
        welcome.greetWithName();

        Menu menu = new Menu();
        menu.menuRunner();
    }

}