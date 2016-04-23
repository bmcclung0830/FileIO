import jodd.json.JsonParser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        String name;


        System.out.println("Welcome! What's your name?");
        name = scanner.nextLine();
        System.out.printf("Thank you for taking this short survey %s", name);
        Car.yourCar();
        Car.saveCar();
        ReadWriteJsonFile.readWriteJson(Car.cars);

    }


}
