import java.io.*;

public class fileinfo {
    public static void main(String[] args) {
                File f =  new File("C:\\Users\\PIYUSH\\OneDrive\\Desktop\\JAVA\\Piyush.txt");


                if (f.exists()) {
        System.out.println("file name :" + f.getName());   
        System.out.println("file Location :" + f.getAbsolutePath()); 
        System.out.println("file Writable :" + f.canWrite());                    
        System.out.println("file Readable :" + f.canRead());    
        System.out.println("file Length :" + f.length());   
        System.out.println("file removed :" + f.delete());                    




                } else {
                    System.out.println("file does nor exist");
                    
                }
    }
}
