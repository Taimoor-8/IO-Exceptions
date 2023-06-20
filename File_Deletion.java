package IO_Exceptions;

import java.io.File;

public class File_Deletion {

    public static void main(String[] args) {

        File file = new File("Friends\\test.txt");
        if (file.delete()){
            System.out.println("File is deleted");
        }
        else{
            System.out.println("Error in deleting file");
        }
    }
}
