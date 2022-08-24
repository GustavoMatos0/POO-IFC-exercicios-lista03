package lista3;

import java.util.Scanner;

public class Ex34 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 0, a = 0, b = 0, c = 0, d = 0;
        while (n >= 0) {
            System.out.print("Informe um número (número negativo para terminar): ");
            n = in.nextInt();
            if (n >= 0 && n <= 25) {
                a++;
            } else if (n >= 0 && n <= 50) {
                b++;
            } else if (n >= 0 && n <= 75) {
                c++;
            } else if (n >= 0 && n <= 100) {
                d++;
            }
        }
        System.out.println("Foram encontrados " + a + " números entre [0-25].");
        System.out.println("Foram encontrados " + b + " números entre [26-50].");
        System.out.println("Foram encontrados " + c + " números entre [51-75].");
        System.out.println("Foram encontrados " + d + " números entre [76-100].");
        in.close();
    }

}
