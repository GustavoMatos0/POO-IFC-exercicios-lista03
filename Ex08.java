package lista3;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int intervalo = 0, maior = 0, menor = 0, soma = 0;
        while (intervalo == 0) {
            System.out.print("Informe um número inteiro: ");
            int n1 = in.nextInt();
            System.out.print("Informe outro número inteiro: ");
            int n2 = in.nextInt();

            if (n2 < n1) { //5(com) 2(fim)
                intervalo = n1 - n2;
                maior = n1;
                menor = n2;
            } else {
                intervalo = n2 - n1;
                maior = n2;
                menor = n1;
            }

            if (intervalo == 0) {
                System.out.println("Intervalo igual a ZERO. Informe novamente.");
                System.out.println("");
            }
        }

        for (int i = menor + 1; i <= maior - 1; i++) {
            System.out.print(i + " ");
            soma += i;
        }
        System.out.println("");
        System.out.println("Soma dos números no intervalo: " + soma);
        in.close();
    }

}
