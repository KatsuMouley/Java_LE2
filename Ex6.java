import java.util.Scanner;
public class Ex6 {
    public static void run(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Please input a Celsius temperature: ");
        double C = input.nextDouble();
        input.nextLine();
        double F = (9 * C + 160) / 5;
        System.out.printf("-------------------------------------\n");
        System.out.printf("%.2f Fahrenheit\n", F);
    }
}
