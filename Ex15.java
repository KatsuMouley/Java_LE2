import java.util.Scanner;

public class Ex15{
    public static void run(){
            Scanner input = new Scanner(System.in);
            double value[] = new double[5];
            double n = 0;
            for (int i = 0; i < value.length; i++) {    
                do {
                    System.out.printf("Por favor insira valor[%d] :\n", i+1);
                    value[i] = input.nextDouble();
                    if (value[i] < n ) {
                        System.out.println("Por favor insira um valor que seja maior do que o valor anterior");
                    } else {
                    n = value[i];
                    }
                } while (value[i] < n);   
            }
            for (int i = 0; i < value.length; i++) {
                System.out.printf("%.1f ", value[i]);
            }
            System.out.printf("\n");
    }
}

