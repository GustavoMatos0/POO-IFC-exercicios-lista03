package lista3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex24 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("##,###.00");

        int cd;
        float valor = 0;
        System.out.print("Quantidade de CDs: ");
        cd = in.nextInt();
        for (int i = 1; i <= cd; i++) {
            System.out.println("Informe o valor do cd " + i + ":");
            valor += in.nextFloat();
        }
        System.out.println("Valor total gasto: " + dc.format(valor) + " R$");
        System.out.println("Valor médio por CD: " + dc.format((valor / cd)) + " R$");
        in.close();
    }

}
