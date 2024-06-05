import java.io.*;

public class readdata {
    
    public static void main(String[] args) {
        try {
            FileReader r =  new FileReader("C:\\Users\\PIYUSH\\OneDrive\\Desktop\\JAVA\\Piyush.txt");
            try{
                int i;
                while ((i =r.read())!=-1){
                    System.out.println((char)i);
                }
                }
                finally{
                    r.close();
                    System.out.println("file close");
                }



        } catch (Exception e) {
System.out.println("Something went wrong");

        }




    }
}
