import java.util.Scanner;
public class Ex7 {
    public static void run(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Please input a number: ");
        int n = input.nextInt();
        input.nextLine();
        if (n > 100 && n < 200) {
            System.out.printf("The number %d is between 100 and 200\n", n);
        } else {
            System.out.printf("The number %d is NOT between 100 and 200\n", n);
        }
    }
}
