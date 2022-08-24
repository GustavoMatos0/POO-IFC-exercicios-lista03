package lista3;

import java.util.Scanner;

public class Ex38 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int max = 10, numfinal = 0;

        System.out.print("Insira um número:");
        int numero = in.nextInt();
        int n1 = numero;

        while (numero != 0) {
            numero %= max;
            numfinal += numero;
            numfinal *= 10;
            n1 -= numero;
            n1 /= 10;
            numero = n1;
        }
        numfinal /= 10;
        System.out.println("Número invertido => " + numfinal);
        in.close();
    }

}
