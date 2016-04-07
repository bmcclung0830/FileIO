import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteJsonFile extends Car{
    public static void main(String[] args) throws IOException{
        Car car = new Car();
        car.year = 2010;
        car.make = "Infinit;";
        car.model = "G37";
        car.engine = 3.7;

        File f = new File("car.json");

        //this is to write the json file
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialize(car);
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();

        //this is to read the json
        Scanner s = new Scanner(f);
        s.useDelimiter("\\Z");
        String contents = s.next();
        JsonParser parser = new JsonParser();
        Car car2 = parser.parse(contents, Car.class);

        System.out.println(car2);
    }
}
