package IO_Exceptions;

import java.io.File;
import java.io.IOException;

public class Basics {

    public static void main(String[] args) throws IOException {

//        To create a directory in relevant folder
        File directory = new File("Taimoor");
        directory.mkdir();
        System.out.println("Directory created");

//        To create file
        File file = new File("Vehicle.dat");
        file.createNewFile();
        System.out.println("File is created");

    }
}
