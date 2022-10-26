import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // get input file from git hub url
        // get write size from user as input.
        try {
            File output = new File("output.txt");
            String absolute =  output.getAbsolutePath();
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter(absolute,true)
            );

            writer.write("Just Testing\n");
            writer.write("Nothing\n");
            writer.close();
        }catch (Exception e){
            System.out.println("could not initialize buffer");
            System.out.println(e);
        }
    }
}
