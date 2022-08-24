package lista3;

public class Ex15 {

    public static void main(String[] args) {
        int n1 = 38;
        int n2 = 39;
        int m = 0;
        float s = 0;
        float ex = 0;

        for (m = 1; m <= 37; m++) {
            n1 = n1 - 1;
            n2 = n2 - 1;
            ex = ((n1 * n2) / m);
            s = (s + ex);
            System.out.print("(" + n1 + "x" + n2 + ")/" + m + " + ");
        }
        System.out.println("\nSoma final = " + s);
    }

}
