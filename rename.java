import java.io.*;

public class rename {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\PIYUSH\\OneDrive\\Desktop\\JAVA\\Piyush.txt");
        File r = new File("C:\\Users\\PIYUSH\\OneDrive\\Desktop\\JAVA\\Suneeta.txt");

        if (f.exists()) {
            System.out.println(f.renameTo(r));
            
        } else {
            System.out.println("File does not exist");
            
        }



    }
}
