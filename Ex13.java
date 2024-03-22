import java.util.Scanner;
public class Ex13{
    public static void run(){
            Scanner input = new Scanner(System.in);
            
            int n;
        System.out.printf("Please Input n: ");
            n = input.nextInt();
            input.nextLine();
            long Fibonacci[] = new long[n+2];
            Fibonacci[0] = 0;
            Fibonacci[1] = 1;
            for (int i = 0; i < n; i++) {
                Fibonacci[i+2] = Fibonacci[i] + Fibonacci[i+1];
                System.out.printf("%d ", Fibonacci[i]);
            }
            System.out.printf("\n");

    }
}
