package lista3;

import java.util.Scanner;

public class Ex29 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n1, com, fim, aux;
        System.out.print("Informe um número: ");
        n1 = in.nextInt();
        System.out.print("Informe o começo: ");
        com = in.nextInt();
        System.out.print("Informe o fim: ");
        fim = in.nextInt();

        if (fim < com) { //5(com) 2(fim)
            aux = fim;
            fim = com;
            com = aux;
        }

        for (int i = com; i <= fim; i++) {
            System.out.println(n1 + " x " + i + " = " + (i * n1));
        }
        in.close();
    }
}
