import java.util.Scanner;

public class Ex5 {
    public static void run(){
        int n = 0;
        Scanner input = new Scanner(System.in);
        System.out.printf("Please input the A value: ");
        int B = input.nextInt();
        System.out.printf("Please input the B value: ");
        int A = input.nextInt();
        input.nextLine();
        System.out.printf("-------------------------------------\n");
        System.out.printf("Antes da troca\n");
        System.out.printf("Variavel B = %d\nVariavel A = %d\n", B, A);
        n = B;
        B = A;
        A = n;
        System.out.printf("Depois da troca\n");
        System.out.printf("Variavel B = %d\nVariavel A = %d\n", B, A);
        System.out.printf("-------------------------------------\n");
    }
}
