package lista3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex26 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("##,###.00");

        System.out.print("Informe o preço do pão: ");
        float preco = in.nextFloat();
        System.out.println("Preço do pão: R$ " + preco);
        System.out.println("------ Panificadora Pão de Ontem - Tabela de preços ------");
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + " - R$ " + dc.format(i * preco));
        }
        in.close();
    }

}
