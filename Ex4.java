import java.util.Scanner;

public class Ex4{
    public static void run(){
            Scanner input = new Scanner(System.in);
            System.out.printf("Please Input n:\n");
            double n = input.nextDouble();
            double array[] = new double[5];
            for (int i = 0; i < 5; i++) {
                System.out.printf("Please Input a number in an array:\n");
                array[i] = input.nextDouble();
                input.nextLine();
            }

            for (int i = 0; i < 5; i++) {
                if (array[i] < n) {
                    System.out.println("O número " + array[i] + " da posição "+ i +" é menor do que " + n);
                }

            }
    }
}

