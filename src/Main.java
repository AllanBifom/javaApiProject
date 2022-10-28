import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // get input file from git hub url
        // get write size from user as input.
        try {
            File output = new File("output.txt");
            File input = new File("input.txt");
            String absolute =  output.getAbsolutePath();
            String absolute2 = input.getAbsolutePath();
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter(absolute,true)
            );

            BufferedReader reader = new BufferedReader(
                    new FileReader(absolute2)
            );
            String inputValue;
            while((inputValue = reader.readLine()) != null){
                writer.write(inputValue + "\n");
            }

            reader.close();
            writer.close();
        }catch (Exception e){
            System.out.println("could not initialize buffer");
            System.out.println(e);
        }
    }
}
