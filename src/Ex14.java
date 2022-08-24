package lista3;

public class Ex14 {

    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 1;

        System.out.print("S = ");
        while (n1 <= 5) {
            System.out.print(n1 + " / " + n2 + " + ");
            n1++;
            n2 += 2;
        }
        System.out.println(" ... + n/m");
    }

}
