//Vikel Cunningham
package mypackage;

import java.util.Scanner; // used to read the data from original file
import java.io.IOException; // thge exception used for errors with the reading or riting to file
import java.io.File; // used to create the File type
import java.io.FileWriter;

public class FileCopy {
    public static void main(String[] args){
        try{                                    // 'try' is for exception handling
            File readFile = new File("input.txt"); // reading from the pathname
            Scanner sc = new Scanner(readFile);             // sc = the entire file from "readfile"
            FileWriter writFile = new FileWriter("output.txt"); // this is the write file 

            while(sc.hasNextLine()){        //while loop to iterate throughout all the lines of code from the scanner
                writFile.write(sc.nextLine());          // wrinting to the file with the data on the line
                writFile.write("\n");           /// this is for the next line being produced after a new line was discovered
            }
            writFile.close();       // close 
            sc.close();
        }
        
        catch (IOException error){
            System.out.println("Error with file."); // exception handling
            error.printStackTrace();
        }
    }
}
