import java.util.Scanner;
public class Ex14{
    public static void run(){
            Scanner input = new Scanner(System.in);
            String arr1 = "";
            String arr2 = "";
            double value[] = new double[5];
            for (int i = 0; i < 5; i++) {
                System.out.printf("Por favor insira um valor[%d]:\n", i+1);
                value[i] = input.nextDouble();
                arr1 += " " + value[i];
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

            double temp = value[value.length - 1];
            value[value.length - 1] = max;
            value[Indice] = temp;

            System.out.printf("\n");
            for (int i = 0; i < value.length; i++) {
                System.out.printf("%.1f ", value[i]);   
            }
            System.out.printf("\n");

    }
}
