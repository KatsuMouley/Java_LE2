import java.util.Scanner;

public class Ex3 {
    public static void run(){
        int n = 0;
        do{
            Scanner input = new Scanner(System.in);
            System.out.printf("Please input the A value(Integer): ");
            int B = input.nextInt();
            System.out.printf("Please input the B value(Integer): ");
            int A = input.nextInt();
            input.nextLine();
            if (A == B) {
                System.out.println("Both values are equals, please insert two unique values.");
            } else {
                System.out.println("The biggest number between A and B is: " + Math.max(A, B));
                n = 1;
            }  
        } while( n == 0);          
    }
}
