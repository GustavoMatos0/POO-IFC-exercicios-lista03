package lista3;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = in.nextLine();
        while (nome.length() < 3) {
            System.out.println("Nome precisa ter mais que 3 caracteres");
            System.out.print("Nome: ");
            nome = in.nextLine();
        }

        System.out.print("Idade: ");
        int idade = in.nextInt();
        while (idade < 0 || idade > 150) {
            System.out.println("Idade Inválida. [0 a 150]");
            System.out.print("Idade: ");
            idade = in.nextInt();
        }

        System.out.print("Salário: ");
        double sal = in.nextDouble();
        while (sal <= 0) {
            System.out.println("Salário precisa ser maior q ZERO");
            System.out.print("Salário: ");
            sal = in.nextDouble();
        }
        in.nextLine();

        System.out.print("Sexo: ");
        char sex = in.nextLine().charAt(0);
        while (sex != 'f' && sex != 'm') {
            System.out.println("Sexo Inválido. [f] ou [m]");
            System.out.print("Sexo: ");
            sex = in.nextLine().charAt(0);
        }

        System.out.print("Estado Civil: ");
        String ec = in.nextLine();
        while (!ec.equals("s") && !ec.equals("c") && !ec.equals("v") && !ec.equals("d")) {
            System.out.println("Estado Civil Inválido. [s], [c], [v], [d]");
            ec = in.nextLine();
        }

        System.out.println("");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + sal + " R$");
        System.out.println("Sexo: " + sex);
        System.out.println("Estado Civil: " + ec);
        in.close();
    }

}
