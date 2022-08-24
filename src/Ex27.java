package lista3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex27 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("##,###.00");

        int teste = 0;
        do {
            float preco = 0, compra = 0, din = 0, troco = 0;
            int n = 0;
            System.out.println("------ Lojas Tabajara ------");
            do {
                n++;
                System.out.print("Produto " + n + " R$ ");
                preco = in.nextFloat();
                compra += preco;
            } while (preco != 0);
            System.out.println("Total: R$ " + dc.format(compra));
            System.out.print("Dinheiro: ");
            din = in.nextFloat();
            troco = din - compra;
            System.out.println("Troco: R$ " + troco);
            System.out.println("\n[1] Proxima compra:");
            System.out.println("[2] Fechar programa");
            teste = in.nextInt();
        } while (teste != 2);
        in.close();
    }
}
