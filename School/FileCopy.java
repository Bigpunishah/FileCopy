//Vikel Cunningham

import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

public class FileCopy {
    public static void main(String[] args){
        try{
            File readFile = new File("input.txt");
            Scanner sc = new Scanner(readFile);
            FileWriter writFile = new FileWriter("output.txt");

            while(sc.hasNextLine()){
                writFile.write(sc.nextLine());
                writFile.write("\n");
            }
            writFile.close();
            sc.close();
        }
        catch (IOException error){
            System.out.println("Error with file.");
            error.printStackTrace();
        }
    }
}
