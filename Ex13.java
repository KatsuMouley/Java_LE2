import java.util.Scanner;

public class Ex13 {
    public static void run(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Insira o valor do A: ");
        Double A = input.nextDouble();
        System.out.printf("Insira o valor do B: ");
        Double B = input.nextDouble();
        input.nextLine();
        System.out.printf("Insira a operação aritmética(- + * /): ");
        char C = input.next().charAt(0);
        System.out.println("O resultado é...");
        switch (C) {
            case '-':
                System.out.println("A subtração de " + A + " por " + B + " = " + (A-B));
                break;
            case '+':
                System.out.println("A soma de " + A + " por " + B + " = " + (A+B));
                break;
            case '*':
                System.out.println("A multiplicação de " + A + " por " + B + " = " + (A*B));
                break;
            case '/':
                System.out.println("A divisão de " + A + " por " + B + " = " + (A/B));                    
                break;
        
            default:
                System.out.println("Insira um operador aritmético válido");
                break;
        }
        
        
    }
}
