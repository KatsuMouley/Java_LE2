import java.util.Scanner;
public class Ex8 {
    public static void run(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Please input a number: ");
        int n = input.nextInt();
        input.nextLine();
        if (n >= 50) {
            System.out.printf("The number %d is BIGGER than 49\n", n);
        } else {
            System.out.printf("The number %d is SMALLER than 50\n", n);
        }
    }
}
