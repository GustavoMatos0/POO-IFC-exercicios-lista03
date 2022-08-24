package lista3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex35 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("##,###.00");

        int teste = 0, codigo = 0, quant = 0, q100 = 0, q101 = 0, q102 = 0, q103 = 0, q104 = 0, q105 = 0;
        float tot = 0, val100 = 0, val101 = 0, val102 = 0, val103 = 0, val104 = 0, val105 = 0;
        System.out.println("Especificação ---- Código ---- Preço");
        System.out.println("Cachorro Quente    100       R$ 1,20");
        System.out.println("Bauru Simples      101       R$ 1,30");
        System.out.println("Bauru com ovo      102       R$ 1,50");
        System.out.println("Hambúrguer         103       R$ 1,20");
        System.out.println("Cheeseburguer      104       R$ 1,30");
        System.out.println("Refrigerante       105       R$ 1,00");
        do {
            System.out.print("Código: ");
            codigo = in.nextInt();
            switch (codigo) {
                case 100:
                    System.out.println("Quantos Cahorros Quentes? ");
                    quant = in.nextInt();
                    val100 += quant * 1.2;
                    tot += quant * 1.2;
                    q100 += quant;
                    break;

                case 101:
                    System.out.println("Quantos Baurus Simples? ");
                    quant = in.nextInt();
                    val101 += quant * 1.3;
                    tot += quant * 1.3;
                    q101 += quant;
                    break;

                case 102:
                    System.out.println("Quantos Baurus com Ovos? ");
                    quant = in.nextInt();
                    val102 += quant * 1.5;
                    tot += quant * 1.5;
                    q102 += quant;
                    break;

                case 103:
                    System.out.println("Quantos Hamburguers? ");
                    quant = in.nextInt();
                    val103 += quant * 1.2;
                    tot += quant * 1.2;
                    q103 += quant;
                    break;

                case 104:
                    System.out.println("Quantos Cheeseburguers? ");
                    quant = in.nextInt();
                    val104 += quant * 1.3;
                    tot += quant * 1.3;
                    q104 += quant;
                    break;

                case 105:
                    System.out.println("Quantos Refrigerantes? ");
                    quant = in.nextInt();
                    val105 += quant * 1;
                    tot += quant * 1;
                    q105 += quant;
                    break;

                default:
                    System.out.println("Código inválido!!!");
            }
            System.out.println("[1] Adicionar mais itens a compra");
            System.out.println("[2] Encerrar compra");
            teste = in.nextInt();
        } while (teste == 1);

        System.out.println("\n----- Pedido Encerrado -----");
        System.out.println("Cachorro Quente    " + q100 + "       R$ " + dc.format(val100));
        System.out.println("Bauru Simples      " + q101 + "       R$ " + dc.format(val101));
        System.out.println("Bauru com ovo      " + q102 + "       R$ " + dc.format(val102));
        System.out.println("Hambúrguer         " + q103 + "       R$ " + dc.format(val103));
        System.out.println("Cheeseburguer      " + q104 + "       R$ " + dc.format(val104));
        System.out.println("Refrigerante       " + q105 + "       R$ " + dc.format(val105));
        System.out.println("Total: R$  " + dc.format(tot));
        in.close();
    }

}
