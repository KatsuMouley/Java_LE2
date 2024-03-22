import java.util.Scanner;
public class Ex9{
    public static void run(){
            Scanner input = new Scanner(System.in);
            
            int A[] = new int[5];
            int B[] = new int[5];
            for (int i = 0; i < 5; i++) {
                System.out.printf("Por favor insira valor do A [%d](Integer):\n", i);
                A[i] = input.nextInt();
                System.out.printf("Por favor insira valor do B [%d](Integer):\n", i);
                B[i] = input.nextInt();
                input.nextLine();
            }
            int C[] = new int[5];
            
            System.out.println("C is equals to: ");
            for (int i = 0; i < C.length; i++) {
                if (i%2 == 0) {
                    C[i] = A[i];
                    System.out.println("Vetor de posição par " + C[i]);
                } else {
                    C[i] = B[i];
                    System.out.println("Vetor de posição impar " + C[i]);
                }
            }

    }
}
