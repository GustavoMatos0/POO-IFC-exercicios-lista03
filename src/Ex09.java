package lista3;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe um número para ver a tabuada: ");
        int n1 = in.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(n1 + " x " + i + " = " + (i * n1));
        }
        in.close();
    }

}
