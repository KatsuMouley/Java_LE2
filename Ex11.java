import java.util.Scanner;
public class Ex11{
    public static void run(){
            Scanner input = new Scanner(System.in);
            
            double A[] = new double[5];
            double B[] = new double[5];
            for (int i = 0; i < 5; i++) {
                System.out.printf("Por favor insira valor do A [%d](Integer):\n", i);
                A[i] = input.nextDouble();
                System.out.printf("Por favor insira valor do B [%d](Integer):\n", i);
                B[i] = input.nextDouble();
                input.nextLine();
            }
            double C[] = new double[5];
            
            System.out.println("C is equals to: ");
            for (int i = 0; i < C.length; i++) {
                    C[i] = B[i] * A[i];
                    System.out.printf(" %.2f", C[i]);
            }
            System.out.printf("\n");

    }
}
