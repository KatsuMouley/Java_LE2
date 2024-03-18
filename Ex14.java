import java.util.Scanner;

public class Ex14 {
    public static void run(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Please input a1: ");
        double a1 = input.nextDouble();
        System.out.printf("Please input n: ");
        double n = input.nextDouble();
        System.out.printf("Please input r: ");
        double r = input.nextDouble();
        input.nextLine();
        double an = a1 + (n-1) * r;
        System.out.println("an = " + an);
                  
    }
}
