import java.io.File;

public class file {
    public static void main(String[] args) {
        File f =  new File("C:\\Users\\PIYUSH\\OneDrive\\Desktop\\JAVA\\Piyush.txt");
        try {
            if (f.createNewFile()) {
                System.out.println("File is created successfully");
            } else {
                System.out.println("File is not created successfully");
                
            }
            
        } catch (Exception e) {
            System.out.println("somthing went wrong");
        }}
}
