package lista3;

import java.util.Scanner;

public class Ex32 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cod, codmaior = 0, codmenor = 0, numv, numa, maiora = 0, menora = Integer.MAX_VALUE, totnumv = 0, i, div = 0, totnuma = 0;
        for (i = 1; i <= 5; i++) {
            System.out.print("Código da cidade: ");
            cod = in.nextInt();
            System.out.print("Número de veículos de passeio (em 1999): ");
            numv = in.nextInt();
            System.out.print("Número de acidentes de trânsito com vítimas (em 1999):");
            numa = in.nextInt();
            if (numv < 2000) {
                div++;
                totnuma += numa;
            }
            if (numa > maiora) {
                maiora = numa;
                codmaior = cod;
            }
            if (numa < menora) {
                menora = numa;
                codmenor = cod;
            }
            totnumv += numv;
            System.out.println("");
        }
        System.out.println("\nA cidade de código: " + codmaior + ", tem o maior índice de acidentes de transitos. Com um total de " + maiora + " ocorrencias.");
        System.out.println("A cidade de código: " + codmenor + ", tem o menor índice de acidentes de transitos. Com um total de " + menora + " ocorrencias.");
        System.out.println("Média de veículos das cinco cidades juntas: " + (totnumv / i) + " veículos.");
        System.out.println("Média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio: " + (totnuma / div) + " ocorrencias.");
        in.close();
    }
}
