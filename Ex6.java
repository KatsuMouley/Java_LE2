import java.util.Scanner;

public class Ex6{
    public static void run(){
            Scanner input = new Scanner(System.in);
            
            double nota[] = new double[5];
            double pesos[] = new double[5];
            double weights = 0;
            double weightPlusNotas = 0;
            for (int i = 0; i < 5; i++) {
                System.out.printf("Questão número " + (i+1) + "\n");
                System.out.printf("Por favor insira a nota do aluno nessa questão:\n");
                nota[i] = input.nextDouble();
                System.out.printf("Por favor insira o peso da questão:\n");
                pesos[i] = input.nextDouble();
                input.nextLine();
                weights += pesos[i];
                weightPlusNotas += pesos[i] * nota[i];
            }
            System.out.println("A media ponderada do aluno é " + (weightPlusNotas/weights));

    }
}

