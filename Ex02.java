package lista3;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe um nome de usuário: ");
        String usuario = in.nextLine();
        System.out.println("Informe uma senha: ");
        String senha = in.nextLine();

        while (usuario.equals(senha)) {
            System.out.println("Login e senha são iguais! Digite novamente.");
            System.out.println("Informe um nome de usuário: ");
            usuario = in.nextLine();
            System.out.println("Informe uma senha: ");
            senha = in.nextLine();
        }
        in.close();
    }

}
