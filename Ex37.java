package lista3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex37 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("#,##.0");

        String res, nome, nomemaior = "", nomemenor = "";
        String[] gab = new String[10];
        int teste, aluno = 0, maiornota = 0, menornota = 10, totnota = 0;

        System.out.println("----- Informe o gabarito -----");
        System.out.println("Informe as respostas em letra minuscula! (a,b,c,d...)");
        for (int i = 0; i < 10; i++) {
            System.out.print("Resposta " + (i + 1) + ": ");
            gab[i] = in.nextLine();
        }
        System.out.println("\n----- Prova -----");
        do {
            int nota = 0;
            System.out.print("Nome: ");
            nome = in.nextLine();
            aluno++;
            System.out.println("Informe as respostas em letra minuscula! (a,b,c,d...)");
            for (int i = 0; i < 10; i++) {
                System.out.print("Resposta da pergunta " + (i + 1) + ": ");
                res = in.nextLine();
                if (res.equals(gab[i])) {
                    nota++;
                }
            }
            totnota += nota;
            if (nota > maiornota) {
                maiornota = nota;
                nomemaior = nome;
            }
            if (nota < menornota) {
                menornota = nota;
                nomemenor = nome;
            }

            System.out.println("Aluno(a): " + nome);
            System.out.println("Nota: " + nota);
            System.out.println("\n[1] Proximo Aluno");
            System.out.println("[2] Encerrar Programa");
            teste = in.nextInt();
            in.nextLine();
        } while (teste == 1);
        System.out.println("Total de Alunos: " + aluno);
        System.out.println("Aluno(a) com maior nota: " + nomemaior + ". Nota: " + maiornota);
        System.out.println("Aluno(a) com menor nota: " + nomemenor + ". Nota: " + menornota);
        System.out.println("Média das notas da Turma: " + dc.format(totnota / aluno));
        in.close();
    }

}
