import java.util.Scanner;

public class Ex15 {
    public static void run(){
        Scanner input = new Scanner(System.in);
        System.out.println("P1(x1,y1): ");
        System.out.printf("Please input x1: ");
        double x1 = input.nextDouble();
        System.out.printf("Please input y1: ");
        double y1 = input.nextDouble();

        System.out.println("P2(x2,y2): ");
        System.out.printf("Please input x2: ");
        double x2 = input.nextDouble();
        System.out.printf("Please input y2: ");
        double y2 = input.nextDouble();
        input.nextLine();
        double d = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        System.out.printf("A distância entre ambos os pontos é de %.2f\n", d);
                  
    }
}
