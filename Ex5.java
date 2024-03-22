import java.util.Scanner;

public class Ex5{
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
            int c = 0;
            for (int i = 0; i < 5; i++) {
                if (array[i] == n) {
                    c++;
                }
            }
            System.out.println("O número " + n + " aparece " + c + " vezes no array");
    }
}

