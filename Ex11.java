import java.util.Scanner;

public class Ex11 {
    public static void run(){
        Scanner input = new Scanner(System.in);
        int n[] = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("Insira o " + (i+1) + "° valor: ");
            n[i] = input.nextInt();
        }
        input.nextLine();
        System.out.printf("n[3] = ");
        for (int i = 0; i < n.length; i++) {
            System.out.printf(n[i] + " ");
        }
        System.out.println();
        //Para solucionar este exercício nós utilizamos a Ordenação por trocas
        for (int i = 0; i < n.length - 1/*3 - 1 = 2. 0 1 2*/; i++) {//Preparando o passo a passo
            for (int j = 0; j < n.length - i - 1/*3 - i - 1 = 0 or 1 or 2 */ ; j++) {//Preparando o valor para comparação
                if (n[j] > n[j + 1]){
                    int value = n[j];
                    n[j] = n[j+1];
                    n[j+1] = value;
                }   
            }
        }
        //We could just use arrays.sort() but Bubble sort is more fun :)
        System.out.printf("n[3] = ");
        for (int i = 0; i < n.length; i++) {
            System.out.printf(n[i] + " ");
        }
        System.out.println();
    }
}
