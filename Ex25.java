package lista3;

import java.text.DecimalFormat;

public class Ex25 {

    public static void main(String[] args) {
        DecimalFormat dc = new DecimalFormat("##,###.00");

        System.out.println("-------- Lojas Quase Dois - Tabela de preços --------");
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + " - R$" + dc.format(i * 1.99));
        }
    }

}
