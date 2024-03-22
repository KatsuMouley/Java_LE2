import java.util.Scanner;
public class Ex12{
    public static void run(){
            Scanner input = new Scanner(System.in);
            
            double value[] = new double[12];
            double product = 1;
            for (int i = 0; i < 12; i++) {
                System.out.printf("Por favor insira um valor[%d]:\n", i+1);
                value[i] = input.nextDouble();
                input.nextLine();
            }
            
            for (int i = 0; i < 12; i++) {
                if (value[i] > 0 && value[i]%2 == 0) {
                    product *= value[i];
                    System.out.printf("%.2f * ",value[i]);
                }
            }
            System.out.printf("1 \n");
            System.out.printf("The final product is %.2f", product);
            System.out.printf("\n");
    }
}
