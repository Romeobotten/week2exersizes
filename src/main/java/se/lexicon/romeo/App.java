package se.lexicon.romeo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        int[][] tabell = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tabell[i][j] = (i + 1) * (j + 1);

                if (tabell[i][j] < 10) {
                    System.out.print("   " + tabell[i][j]);
                } else
                    System.out.print("  " + tabell[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tabell[i][j] = (i + 1) * (j + 1);

                if (i == j) {
                    System.out.print("   " + tabell[i][j]);
                }
            }
            System.out.println();
        }

    }
}

