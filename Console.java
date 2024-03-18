import java.util.Scanner;
public class Console{
    public static void main(String[] args) {
            int n = 0;
        do{
            System.out.printf("Escolha uma atividade para executar\n(1 - 20)\nInput:");
            int value = UL.lerInteiro();
            switch (value) {
                case 1:
                    Ex1.run();                    
                    break;
                case 2:
                    Ex2.run();
                    break;
                case 3:
                    Ex3.run();
                    break;
                case 4:
                    Ex4.run(); 
                    break;
                case 5:
                    Ex5.run();
                    break;
                case 6:
                    Ex6.run(); 
                    break;
                case 7:
                    Ex7.run();
                    break;
                case 8:
                    Ex8.run(); 
                    break;
                case 9:
                    Ex9.run();
                    break;
                case 10:
                    Ex10.run();
                    break;
                case 11:
                    Ex11.run();
                    break;
                case 12:
                    Ex12.run();
                    break;
                case 13:
                    Ex13.run();
                    break;
                case 14:
                    Ex14.run();
                    break;
                case 15:
                    Ex15.run();
                    break;
                default:
                    break;
            }
            
            System.out.printf("Do you want to execute again?: (1)Yes (0)No\nInput:");
            Scanner input = new Scanner(System.in);
            n = input.nextInt();
        } while(n == 1);
    }
}