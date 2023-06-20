package IO_Exceptions;

import java.io.*;
import java.util.Scanner;

public class Reading_Files {

    public static void main(String[] args) {

//        To read files using buffer reader
        try{
            BufferedReader br = new BufferedReader(new FileReader("Friends\\test.txt"));
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
        catch (IOException e) {
            System.out.println("Unable to read data from file");
        }

//        To read files using Scanner class
        /*try {
            Scanner sc = new Scanner(new File("Friends\\test.txt"));
            String line;
            while (sc.hasNext()){
                line = sc.nextLine();
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Cannot read elements from the file");
        }*/
    }
}
