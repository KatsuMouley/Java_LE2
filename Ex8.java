import java.util.Scanner;
public class Ex8{
    public static void run(){
            Scanner input = new Scanner(System.in);
            
            int A[] = new int[5];
            int B[] = new int[5];
            for (int i = 0; i < 5; i++) {
                System.out.printf("Por favor insira valor do A [%d]:\n", i+1);
                A[i] = input.nextInt();
                System.out.printf("Por favor insira valor do B [%d]:\n", i+1);
                B[i] = input.nextInt();
                input.nextLine();
            }
            
            String str[] = new String[5];
            for (int i = 0; i < 5; i++) {
                str[i] = "";
                str[i] += Integer.toString(A[i]);
                str[i] += Integer.toString(B[i]);
                System.out.println("String "+(i+1)+" equals to " + str[i]);
            }

    }
}


//8. Dados dois vetores A e B de 5 elementos cada, criar um vetor C que representa aconcatenação de A e B, ou seja, C contém os elementos de A seguidos dos elementosde B.