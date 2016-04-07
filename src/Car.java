import java.util.Scanner;

/**
 * Created by Brittany on 4/6/16.
 */
public class Car {

    int year;
    String color;
    String make;
    String model;
    double engine;

    static Scanner carScanner = new Scanner(System.in);
    static Scanner yearScanner = new Scanner(System.in);
    static Scanner engineScanner = new Scanner(System.in);



    public static void yourCar() {
        System.out.println("You will be asked 5 simple questions. Please answer them to the best of your ability.\n" +
                "1. What year is the vehicle you are currently driving?");
        int year = yearScanner.nextInt();
        System.out.println("2. What color is the vehicle you are currently driving?");
        String color = carScanner.nextLine();
        System.out.println("3. What is the make of the vehicle you are currently driving?");
        String make = carScanner.nextLine();
        System.out.println("4. What is the model of the vehicle you are currently driving?");
        String model = carScanner.nextLine();
        System.out.println("5. What is size of the engine in the vehicle you are currently driving. [Enter your answer in the form of: 3.7]");
        double engine = engineScanner.nextDouble();

        System.out.printf("So let's review:\n" +
                "The car you currently drive is a " +
                "%s, %s, %s, %s, %s",  + year, color, make, model, engine + ".");


    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return String.format("So let's review:\n" +
                "The car you currently drive is a " +
                "%s, %s, %s, %s, %s",  +year, color, make, model, engine + ".");
    }
}
