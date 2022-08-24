package lista3;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float nota;

        do {
            System.out.println("Informe uma nota entre 0 e 10): ");
            nota = in.nextFloat();
            if (nota > 10 || nota < 0) {
                System.out.println("Valor Inválido!");
            }
        } while (nota > 10 || nota < 0);
        System.out.println("Valor Válido!");
        in.close();
    }

}
