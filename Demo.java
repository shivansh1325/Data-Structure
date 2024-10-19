import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter N");

        int n = myObj.nextInt(); // Read user input
        
         
            int i=1, s=1;
            while(s <= n) {
            i++;
            s= s+i;
            System.out.println("*");
            }
    }
}
