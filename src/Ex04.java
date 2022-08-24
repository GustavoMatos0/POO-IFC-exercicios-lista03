package lista3;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float paisA = 80000, paisB = 20000;
        double ca = 0.03, cb = 0.015;
        int anos = 0;
        String confirma = "";
        while (paisA <= paisB) {
            anos++;
            paisA += paisA * ca;
            paisB += paisB * cb;
        }
        System.out.println("Pais A ultrapasse o Pais B após " + anos + " anos.");
        System.out.println("");

        do {
            System.out.print("Informe a população de A: ");
            paisA = in.nextFloat();
            while (paisA <= 0) {
                System.out.println("ERRO. Pais A precisa ser maior que ZERO");
                System.out.print("Informe a população de A: ");
                paisA = in.nextFloat();
            }

            System.out.print("Informe porcentagem de crescimento pais A: [%]");
            ca = in.nextDouble();
            while (ca < 0) {
                System.out.println("Porcentagem precisa ser igual ou maior a ZERO");
                System.out.print("Informe porcentagem de crescimento pais A: [%]");
                ca = in.nextDouble();
                ca /= 100;
            }

            System.out.print("Informe a população de B: ");
            paisB = in.nextFloat();
            while (paisB <= 0) {
                System.out.println("ERRO. Pais B precisa ser maior que ZERO");
                System.out.print("Informe a população de B: ");
                paisB = in.nextFloat();
            }

            System.out.print("Informe porcentagem de crescimento pais B: [%]");
            cb = in.nextDouble();
            while (cb < 0) {
                System.out.println("Porcentagem precisa ser igual ou maior a ZERO");
                System.out.print("Informe porcentagem de crescimento pais B: [%]");
                cb = in.nextDouble();
                cb /= 100;
            }

            while (paisA <= paisB) {
                anos++;
                paisA += paisA * ca;
                paisB += paisB * cb;
            }
            in.nextLine();
            System.out.println("Pais A ultrapasse o Pais B após " + anos + " anos.");
            System.out.println("");
            System.out.println("Deseja continuar? [s] [n]");
            confirma = in.nextLine();
        } while (confirma.equals("s"));
        in.close();
    }

}
