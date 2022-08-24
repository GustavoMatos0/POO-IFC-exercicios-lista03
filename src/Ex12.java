package lista3;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 1, num2 = 0;
        System.out.println("Informe o  n−ésimo termo: ");
        int term = in.nextInt();

        System.out.print(num2 + " " + num1 + " ");

        for (int i = 0; i < term - 2; i++) {
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.print(num1 + " ");
        }
        in.close();
    }

}
