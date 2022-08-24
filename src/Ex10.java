package lista3;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe o valor da base: ");
        int base = in.nextInt();
        System.out.print("Informe o valor do expoente: ");
        int expoente = in.nextInt();

        int res = 1;
        for (int i = 0; i < expoente; i++) {
            res *= base;
        }
        System.out.println("Resultado: " + res);
        in.close();
    }

}
