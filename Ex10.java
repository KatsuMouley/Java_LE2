import java.util.Scanner;
public class Ex10 {
    public static void run(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Please insert a value between 1 and 5: ");
        int n = input.nextInt();
        input.nextLine();
        switch (n) {
            case 1:
                System.out.println("Este é o número Um");
                break;
            case 2:
                System.out.println("Este é o número Dois");
                break;
            case 3:
                System.out.println("Este é o número Três");
                break;
            case 4:
                System.out.println("Este é o número Quatro");
                break;
            case 5:
                System.out.println("Este é o número Cinco");
                break;
        
            default:
                System.out.println("Número invalido!");
                break;
        }   
    }
}
