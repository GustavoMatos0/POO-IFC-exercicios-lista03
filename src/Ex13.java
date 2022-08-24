package lista3;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fat = 1;

        System.out.print("Insira o numéro: ");
        int n1 = in.nextInt();

        for (int i = 1; i <= n1; i++) {
            fat *= i;
        }
        System.out.println("Fatorial de " + n1 + " : " + fat);
        in.close();
    }

}
