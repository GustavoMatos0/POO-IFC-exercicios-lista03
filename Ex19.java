package lista3;

import java.util.Scanner;

public class Ex19 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, div = 0;

        System.out.print("Verificar primos até: ");
        n1 = in.nextInt();
        for (int i = 1; i <= n1; i++) {
            if ((i % 2 == 1) && (i != 2) || (i == 2)) {
                System.out.print(i + "  ");
                div++;
            } else {
                div++;
            }
        }
        System.out.println("\nNúmero de divisões feitas: " + div);
        in.close();
    }

}
