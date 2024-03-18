import java.util.Scanner;

public class Ex3{
    public static void run(){
            Scanner input = new Scanner(System.in);
            System.out.printf("Quantos números você deseja digitar? ");
            int Quantity = input.nextInt();
            double array[] = new double[Quantity];
            for (int i = 0; i < Quantity; i++) {
                System.out.printf("Please Input a number:\n");
                array[i] = input.nextDouble();
                input.nextLine();
            }
            double vetorDobrado[] = new double[Quantity];
            for (int i = 0; i < Quantity; i++) {
                vetorDobrado[i] = array[i] * 2;
                System.out.println("O dobro do número " + array[i] + " é igual a "+ vetorDobrado[i]);
            }
    }
}

