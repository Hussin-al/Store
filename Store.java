import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Waren und Preise definieren
        String[] waren = {"Wurst", "Käse", "Brot", "DVD"};
        double[] preise = {4.20, 2.30, 2.10, 12.00};
        int[] anzahl = new int[waren.length];
        double gesamt = 0.0;

        // Eingabe der Anzahl jedes Artikels
        for (int i = 0; i < waren.length; i++) {
            System.out.print("Anzahl " + waren[i] + ": ");
            anzahl[i] = scanner.nextInt();
            gesamt += anzahl[i] * preise[i];
        }

        // Kassenbon ausgeben
        System.out.println("\nKassenbon:");
        for (int i = 0; i < waren.length; i++) {
            double positionsumme = anzahl[i] * preise[i];
            System.out.printf("%-10s %d x %6.2f EUR\n", waren[i], anzahl[i], preise[i]);
            System.out.printf("%18.2f EUR\n", positionsumme);
        }

        // Gesamtsumme ausgeben
        System.out.println("----------------------------------");
        System.out.printf("Gesamt%26.2f EUR\n", gesamt);

        // Eingabe des gegebenen Geldbetrags
        System.out.print("Gegeben: ");
        double gegeben = scanner.nextDouble();

        // Berechnung und Ausgabe des Rückgelds
        double rueckgeld = gegeben - gesamt;
        System.out.printf("Zurück%26.2f EUR\n", rueckgeld);

        scanner.close();
    }
}
