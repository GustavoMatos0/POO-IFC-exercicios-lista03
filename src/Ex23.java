package lista3;

import java.util.Scanner;

public class Ex23 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int turma, aluno = 0, soma = 0;

        System.out.println("Quantidade de turmas: ");
        turma = in.nextInt();
        for (int i = 1; i <= turma; i++) {
            System.out.println("Quantidade de alunos da turma: " + i);
            aluno = in.nextInt();
            while (aluno > 40) {
                System.out.println("Quantidade de alunos maior que 40");
                System.out.println("Insira novamente");
                System.out.println("Quantidade de alunos da turma " + i + ":");
                aluno = in.nextInt();
            }
            soma += aluno;
        }
        System.out.println("Média de alunos por turma: " + (soma / turma));
        in.close();
    }

}
