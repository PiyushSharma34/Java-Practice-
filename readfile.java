import java.io.*;
import java.io.FileWriter;

public class readfile {
    public static void main(String[] args) {
        try {
            FileWriter f  = new FileWriter("C:\\Users\\PIYUSH\\OneDrive\\Desktop\\JAVA\\Piyush.txt");

            try{
                f.write("java Promming is good and i am also");
            }
            finally{
                f.close();
            }
            System.out.println("successfuly data ");
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
