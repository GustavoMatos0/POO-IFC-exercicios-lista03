package lista3;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int qimp = 0, qpar = 0, n = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe o " + i + "o valor:");
            n = in.nextInt();
            if (n % 2 == 0) {
                qpar++;
            } else {
                qimp++;
            }
        }
        System.out.println("Quantidade de PARES: " + qpar);
        System.out.println("Quantidade de IMPARES: " + qimp);
        in.close();
    }

}
