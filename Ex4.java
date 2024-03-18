import java.util.Scanner;

public class Ex4 {
    public static void run(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Please input the first value: ");
        double n1 = input.nextDouble();
        System.out.printf("Please input the second value: ");
        double n2 = input.nextDouble();
        input.nextLine();
        System.out.println("A subtração de ambos os valores é: " + (n1 - n2));
        System.out.println("A soma de ambos os valores é: " + (n1 + n2));
        System.out.println("A multiplicação de ambos os valores é: " + (n1 * n2));
        System.out.println("A divisão de ambos os valores é: " + (n1 / n2) + " e " + (n2 / n1));
                  
    }
}
