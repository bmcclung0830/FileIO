import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
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
    static ArrayList<Car> cars = new ArrayList<>();

    public Car(int year, String color, String make, String model, double engine) {
        this.year = year;
        this.color = color;
        this.make = make;
        this.model = model;
        this.engine = engine;
    }

    public Car(){
    }

    public static String yourCar() throws FileNotFoundException {
        File f = new File("car.json");
        Scanner s = new Scanner(f);
        s.useDelimiter("\\Z");
        String contents = s.next();
        JsonParser p = new JsonParser();
        cars = p.parse(contents);


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

        cars.add(new Car(year, color, make, model, engine));

        System.out.printf("So let's review:\n" +
                "The car you currently drive is a " +
                "%s, %s, %s, %s, %s",  + year, color, make, model, engine + ".");
        return "";
    }

    public static void saveCar() throws IOException {
        JsonSerializer s = new JsonSerializer();
        String json = s.include("*").serialize(cars);

        File f = new File("car.json");
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();
    }


    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getEngine() {
        return engine;
    }


    @Override
    public String toString() {
        return String.format("So let's review:\n" +
                "The car you currently drive is a " +
                "%s, %s, %s, %s, %s",  +year, color, make, model, engine + ".");
    }
}
