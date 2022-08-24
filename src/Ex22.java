package lista3;

import java.util.Scanner;

public class Ex22 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tot, voto, fab = 0, ale = 0, gus = 0;

        System.out.print("Total de votantes: ");
        tot = in.nextInt();
        for (int i = 1; i <= tot; i++) {
            System.out.println("Vote [1] para Fabio");
            System.out.println("Vote [2] para Alexandra");
            System.out.println("Vote [3] para Gustavo");
            voto = in.nextInt();
            switch (voto) {
                case 1:
                    fab++;
                    break;
                case 2:
                    ale++;
                    break;
                case 3:
                    gus++;
                    break;
                default:
                    System.out.println("Voto invalido!");
                    System.out.println("Não contabilizado.\n");
            }
        }
        System.out.println("------------- Total de votos -------------");
        System.out.println("Fabio: " + fab + " votos");
        System.out.println("Alexandra: " + ale + " votos");
        System.out.println("Gustavo: " + gus + " votos");
        in.close();
    }

}
