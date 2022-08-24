package lista3;

import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, maior, menor, soma = 0;

        System.out.print("Informe o 1o número: ");
        n = in.nextInt();
        maior = n;
        menor = n;
        soma = n;
        for (int i = 2; i <= 10; i++) {
            System.out.print("Infome o " + i + "o número: ");
            n = in.nextInt();
            soma += n;
            if (n > maior) {
                maior = n;
            }
            if (n < menor) {
                menor = n;
            }
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Soma: " + soma);
        in.close();
    }

}
