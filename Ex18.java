package lista3;

import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int teste = 0, n1;

        System.out.print("Verificar se um número é primo: ");
        n1 = in.nextInt();
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0) {
                teste++;
            }
        }
        if (teste == 2) {
            System.out.println("O número " + n1 + " é primo");
        } else {
            System.out.println("O número " + n1 + " não é primo");
            System.out.print("Números divisiveis: ");
            for (int i = 1; i <= n1; i++) {
                if (n1 % i == 0) {
                    System.out.print(i + " ");;
                }
            }
        }
        in.close();
    }

}
