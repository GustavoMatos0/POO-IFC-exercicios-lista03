package lista3;

import java.util.Scanner;

public class Ex31 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n, nalt = 0, nbaixo = 0;
        float alt, maioralt = Float.MIN_VALUE, menoralt = Float.MAX_VALUE;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Número do aluno: ");
            n = in.nextInt();
            System.out.print("Altura do aluno em centimetros: ");
            alt = in.nextFloat();
            if (alt > maioralt) {
                maioralt = alt;
                nalt = n;
            }
            if (alt < menoralt) {
                menoralt = alt;
                nbaixo = n;
            }
        }
        System.out.println("O aluno " + nalt + " tem a maior altura com: " + maioralt + " centimetros.");
        System.out.println("O aluno " + nbaixo + " tem a menor altura com: " + menoralt + " centimetros.");
        in.close();
    }

}
