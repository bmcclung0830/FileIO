import jodd.json.JsonParser;
import jodd.json.JsonSerializer;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadWriteJsonFile extends Car{


        static void readWriteJson(ArrayList cars) throws Exception{

            File f = new File("car.json");

            //this is to write the json file
            JsonSerializer serializer = new JsonSerializer();
            String json = serializer.serialize(cars);
            FileWriter fw = new FileWriter(f);
            fw.write(json);
            fw.close();

            //this is to read the json
            Scanner s = new Scanner(f);
            s.useDelimiter("\\Z");
            String contents = s.next();
            JsonParser parser = new JsonParser();
            ArrayList<Car> cars1 = parser.parse(contents, ArrayList.class);

            System.out.println(cars1);
        }
}
