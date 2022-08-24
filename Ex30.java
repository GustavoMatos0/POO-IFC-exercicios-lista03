package lista3;

import java.util.Scanner;

public class Ex30 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int codigo = 1, codalt = 0, codbaixo = 0, codgordo = 0, codmagro = 0, div = 0;
        float alt = 0, peso = 0, totalt = 0, totpeso = 0, menoralt = Float.MAX_VALUE, maioralt = Float.MIN_VALUE, menorpeso = Float.MAX_VALUE, maiorpeso = Float.MIN_VALUE;
        while (codigo != 0) {
            System.out.print("Codigo [digite 0 para sair do programa]: ");
            codigo = in.nextInt();
            if (codigo == 0) {
                break;
            }
            System.out.print("Altura: ");
            alt = in.nextFloat();
            System.out.print("Peso: ");
            peso = in.nextFloat();
            totpeso += peso;
            totalt += alt;
            div++;
            if (alt > maioralt) {
                maioralt = alt;
                codalt = codigo;
            }
            if (alt < menoralt) {
                menoralt = alt;
                codbaixo = codigo;
            }
            if (peso > maiorpeso) {
                maiorpeso = peso;
                codgordo = codigo;
            }
            if (peso < menorpeso) {
                menorpeso = peso;
                codmagro = codigo;
            }
        }
        System.out.println("\nCódigo mais baixo: " + codbaixo);
        System.out.println("Altura mais baixa: " + menoralt);
        System.out.println("Código mais alto: " + codalt);
        System.out.println("Altura mais alta: " + maioralt);
        System.out.println("\nCódigo mais gordo: " + codgordo);
        System.out.println("Peso mais gordo: " + maiorpeso);
        System.out.println("Código mais magro: " + codmagro);
        System.out.println("Peso mais magro: " + menorpeso);
        System.out.println("\nMédia das Alturas: " + (totalt / div));
        System.out.println("Média dos Pesos: " + (totpeso / div));
        in.close();
    }

}
