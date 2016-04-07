import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteFile {
    public static void main (String[] args) throws IOException {
        File f = new File("car.txt");
        FileWriter fw = new FileWriter(f);
        fw.write("Car\n");
        fw.close();

        //prints the read write file line by line
        Scanner rwfScanner = new Scanner(f);
        while ( rwfScanner.hasNext()) {
            System.out.println(rwfScanner.nextLine());
        }
        //prints the entire read write file
        rwfScanner = new Scanner(f);
        rwfScanner.useDelimiter("\\Z");
        String contents = rwfScanner.next();
        System.out.println(contents);
    }
}

