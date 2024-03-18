import java.util.Scanner;
public class Ex1{
        public static void run(){
            Scanner input = new Scanner(System.in);
            double array[] = new double[5];
            for (int i = 0; i < 5 ; i++) {
                System.out.printf("Please input an value: ");
                array[i] = input.nextDouble();
                input.nextLine(); 
            }
            double media = 0;
            for (int i = 0; i < 5; i++) {
                media = media + array[i];
            }        
            System.out.println("A media de tudo é :" + (media/5));
        }
    } 
