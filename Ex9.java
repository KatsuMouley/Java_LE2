import java.util.Scanner;

public class Ex9 {
    public static void run(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Please input the A value(Integer): ");
        int B = input.nextInt();
        System.out.printf("Please input the B value(Integer): ");
        int A = input.nextInt();
        input.nextLine();
        if (A == B) {
            System.out.println("Both values "+ A +" and "+ B +" are equals.");
        } else {
            System.out.println("Both values "+ A +" and "+ B +" are different. The biggest number between them is " + Math.max(A, B));
        }     
    }
}
