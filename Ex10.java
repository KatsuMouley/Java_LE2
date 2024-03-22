import java.util.Scanner;
public class Ex10{
    public static void run(){
            Scanner input = new Scanner(System.in);
            
            int A[] = new int[5];
            int B[] = new int[5];
            for (int i = 0; i < 5; i++) {
                System.out.printf("Por favor insira valor do A [%d](Integer):\n", i);
                A[i] = input.nextInt();
                input.nextLine();
            }
            for (int i = 0; i < A.length; i++) {
                System.out.printf(" %d", A[i]);
            }
            System.out.printf("\n");
            int j = 0;
            for (int i = 4; i >= 0; i--) {
                B[j] = A[i];
                System.out.printf(" %d", B[j]);
                j++;
            }
            System.out.printf("\n");
    }
}
