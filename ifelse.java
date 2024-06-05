import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        int pwd;
        System.out.println("Enter Your Marks");
        Scanner obj =new Scanner(System.in);
        pwd = obj.nextInt();
if (pwd >80) {
    System.out.println("A");    
    
} else if (pwd <60) {
    System.out.println("B");
} 
else if (pwd <50) {
    System.out.println("C");
}
else{
    System.out.println("Write Valid MArks");
}
}
}
