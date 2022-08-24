package lista3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex33 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("##,###.00");
        float divida, valor1, valor2, valor3, valor4, valor5;
        float juros1 = 0, juros2, juros3, juros4, juros5;
        System.out.print("Informe o valor da divida: ");
        divida = in.nextFloat();
        juros2 = ((divida / 100) * 10);
        juros3 = ((divida / 100) * 15);
        juros4 = ((divida / 100) * 20);
        juros5 = ((divida / 100) * 25);

        valor1 = (divida + juros1) / 1;
        valor2 = (divida + juros2) / 3;
        valor3 = (divida + juros3) / 6;
        valor4 = (divida + juros4) / 9;
        valor5 = (divida + juros5) / 12;

        System.out.println("Valor da dívida --- Valor dos Juros --- Quantidade de parcelas --- Valor da parcela");
        for (int i = 1; i <= 5; i++) {
            switch(i){
                case 1:
                    System.out.println("R$ " + dc.format(divida + juros1) + " ----------------  " + juros1 + " ----------------- 1 ---------------- R$ " + dc.format(valor1));
                    break;
                case 2:
                    System.out.println("R$ " + dc.format(divida + juros2) + " ----------------  " + dc.format(juros2) + " ----------------- 3 ---------------- R$ " + dc.format(valor2));
                    break;
                case 3:
                    System.out.println("R$ " + dc.format(divida + juros3) + " ----------------  " + dc.format(juros3) + " ----------------- 6 ---------------- R$ " + dc.format(valor3));
                    break;
                case 4:
                    System.out.println("R$ " + dc.format(divida + juros4) + " ----------------  " + dc.format(juros4) + " ----------------- 9 ---------------- R$ " + dc.format(valor4));
                    break;
                case 5:
                    System.out.println("R$ " + dc.format(divida + juros5) + " ----------------  " + dc.format(juros5) + " ----------------- 12 ---------------- R$ " + dc.format(valor5));
                    break;
            }
        }
        in.close();

    }
}
