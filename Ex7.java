import java.util.Scanner;
import java.util.Arrays;

public class Ex7{
    public static void run(){
            Scanner input = new Scanner(System.in);
            
            double valor1[] = new double[5];
            double valor2[] = new double[5];
            for (int i = 0; i < 5; i++) {
                System.out.printf("Por favor insira valor do vetor1 [%d]:\n", i+1);
                valor1[i] = input.nextDouble();
                System.out.printf("Por favor insira valor do vetor2 [%d]:\n", i+1);
                valor2[i] = input.nextDouble();
                input.nextLine();
            }
            if (Arrays.equals(valor1, valor2)) {
                System.out.println("Ambos arrays são iguais");
                for (int i = 0; i < 5; i++) {
                    System.out.println("O vetor1["+(i+1)+"] É igual ao vetor2["+(i+1)+"] |"+ valor1[i] + " = " + valor2[i]);
                }   
            } else {
                System.out.println("Ambos arrays NÃO são iguais");
            }

    }
}

