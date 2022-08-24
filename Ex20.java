package lista3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("##,###.00");
        int quan;
        float soma = 0;
        System.out.print("Quantas notas deseja informar? ");
        quan = in.nextInt();
        for (int i = 1; i <= quan; i++) {
            System.out.print("\nInforme a " + i + "o nota: ");
            soma += in.nextFloat();
        }
        System.out.println("Média: " + dc.format(soma / quan));
        in.close();
    }

}
