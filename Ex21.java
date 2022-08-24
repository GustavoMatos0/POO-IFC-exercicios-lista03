package lista3;

import java.util.Scanner;

public class Ex21 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int pessoa, idade = 0;
        float media = 0;
        System.out.print("Verificar idade de quantas pessoas? ");
        pessoa = in.nextInt();
        for (int i = 1; i <= pessoa; i++) {
            System.out.print("Idade: ");
            idade += in.nextInt();
            System.out.println("");
        }
        media = idade / pessoa;
        if (media < 25) {
            System.out.println("Turma Jovem");
        } else if (media < 60) {
            System.out.println("Turma Adulta");
        } else {
            System.out.println("Turma Idosa");
        }
        in.close();
    }

}
