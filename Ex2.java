import java.util.Scanner;

public class Ex2{
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

            for (int i = 0; i < array.length; i++) {
                System.out.printf("O numero " + array[i] + " da posição " + i);
                if (array[i] > 0) {
                    System.out.printf(" é maior do que zero\n");
                } else if (array[i] < 0){
                    System.out.printf(" é menor do que zero\n");
                } else {
                    System.out.printf(" é zero!\n");
                }
            }
    }
}

