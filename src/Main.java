import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;

        System.out.println("Welcome! What's your name?");
        name = scanner.nextLine();
        System.out.printf("Thank you for taking this short survey %s", name);
        Car.yourCar();
    }
}
