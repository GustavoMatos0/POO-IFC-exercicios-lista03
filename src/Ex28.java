package lista3;

import java.util.Scanner;

public class Ex28 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int teste = 0, div = 0;
        float temp = 0, menor = 0, maior = 0, media = 0, tottemp = 0;
        do {
            System.out.print("\nTemperatura: ");
            temp = in.nextFloat();
            if (menor == 0) {
                menor = temp;
            }
            if (temp > maior) {
                maior = temp;
            }
            if (temp < menor) {
                menor = temp;
            }
            tottemp += temp;
            div++;
            System.out.println("\n[1] Proxima Temperatura");
            System.out.println("[2] Sair do programa");
            teste = in.nextInt();
        } while (teste == 1);
        System.out.println("Maior temperatura: " + maior);
        System.out.println("Menor temperatura: " + menor);
        System.out.println("Media das temperauras: " + (tottemp / div));
        in.close();
    }

}
