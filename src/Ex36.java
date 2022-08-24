package lista3;

import java.util.Scanner;

public class Ex36 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int teste = 0, voto = 0, joao = 0, maria = 0, lula = 0, ciro = 0, nulo = 0, branco = 0;
        System.out.println("------ Eleições ------");
        System.out.println("Vote [1] João");
        System.out.println("Vote [2] Maria");
        System.out.println("Vote [3] Lula");
        System.out.println("Vote [4] Ciro");
        System.out.println("Vote [5] Nulo");
        System.out.println("Vote [6] Branco");
        do {
            System.out.print("Voto: ");
            voto = in.nextInt();
            switch (voto) {
                case 1:
                    System.out.println("Voto contabilizado para João");
                    joao++;
                    break;
                case 2:
                    System.out.println("Voto contabilizado para Maria");
                    maria++;
                    break;
                case 3:
                    System.out.println("Voto contabilizado para Lula");
                    lula++;
                    break;
                case 4:
                    System.out.println("Voto contabilizado para Ciro");
                    ciro++;
                    break;
                case 5:
                    System.out.println("Voto NULO contabilizado");
                    nulo++;
                    break;
                case 6:
                    System.out.println("Voto BRANCO contabilizado");
                    branco++;
            }
            System.out.println("\n[1] Continuar votando");
            System.out.println("[2] Encerrar Votação");
            teste = in.nextInt();
        } while (teste == 1);
        System.out.println("\n------ Resultados ------");
        System.out.println("João: " + joao + " votos.");
        System.out.println("Maria: " + maria + " votos.");
        System.out.println("Lula: " + lula + " votos.");
        System.out.println("Ciro: " + ciro + " votos.");
        System.out.println("Nulo: " + nulo + " votos.");
        System.out.println("Branco: " + branco + " votos.");

        if (joao > maria && joao > lula && joao > ciro) {
            System.out.println("João Venceu as eleições");
        } else if (maria > joao && maria > lula && maria > ciro) {
            System.out.println("Maria Venceu as eleições");
        } else if (lula > maria && lula > joao && lula > ciro) {
            System.out.println("Lula Venceu as eleições");
        } else if (ciro > maria && ciro > lula && ciro > joao) {
            System.out.println("Ciro Venceu as eleições");
        }
        in.close();
    }

}
