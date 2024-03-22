import java.util.Scanner;
public class Ex14{
    public static void run(){
            Scanner input = new Scanner(System.in);
            double value[] = new double[5];
            for (int i = 0; i < 5; i++) {
                System.out.printf("Por favor insira um valor[%d]:\n", i+1);
                value[i] = input.nextDouble();
                input.nextLine();
            }
            for (int i = 0; i < value.length; i++) {
                System.out.printf("%.1f ", value[i]);   
            }
            double max = value[0];
            int Indice = 0;
            for (int i = 0; i < 5; i++) {
                if (value[i] > max) {
                    Indice = i;
                    max = value[i];
                }
            }

            for (int i = 0; i < 5; i++) {
                if (Indice <= i && i < 4) {
                    value[i] = value[i+1];
                }
            }
            value[value.length - 1] = max;

            System.out.printf("\n");
            for (int i = 0; i < value.length; i++) {
                System.out.printf("%.1f ", value[i]);   
            }
            System.out.printf("\n");

    }
}
