package IO_Exceptions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writing_To_File {

    public static void main(String[] args) {

//        To create directory and subdirectories as well
        File directory = new File("Friends");
        directory.mkdirs();
        System.out.println("Folder created successfully");

//        To create file
        File file = new File("Friends\\test.txt");
        try {
            file.createNewFile();
            System.out.println("File created successfully");
        }
        catch (IOException e) {
            System.out.println("Error while creating the file");
        }

//        To write into the file

        try(BufferedWriter bw = new BufferedWriter( new FileWriter(file))) {
            bw.write("Adnan");
            bw.newLine();
            bw.write("Awais");
            bw.newLine();
            bw.write("Aftab");
            bw.newLine();
            bw.write("Ibrahim");
            bw.newLine();

            System.out.println("Written to the file successfully");
        }
        catch (IOException e) {
            System.out.println("Error while writing to the file");
        }
    }
}
