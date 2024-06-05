import java.util.Scanner;

public class ifcondition {
 public static void main(String[] args) {
    int pwd;
    System.out.println("Enter the password");
    Scanner obj = new Scanner(System.in);
    pwd=obj.nextInt();

    if (pwd==9696) {
        System.err.println("My name is := Piyush");
        System.err.println("My age is := 22");
        System.err.println("My Gender is := Male");
        System.err.println("My course is := Adit");
        System.err.println("My address is := Allahabad");
    }
    else{
        System.err.println("Invalid password");
    }
 }
    









}



