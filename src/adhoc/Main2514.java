/** Problem: 2514 - Elo Calculator
 *  Judge: Caribbean Online Judge
 *  Auth: Iván Romero Gárcia
 *  Solution: Obtener el nuevo rating mediante la formula: Ra + K * (W - We).
 *  Y obtener la media usando el antiguo rating.
 * */
package adhoc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author rous
 */
public class Main2514 {

    public static InputStreamReader isr = new InputStreamReader(System.in);
    public static BufferedReader br = new BufferedReader(isr);
    public static OutputStreamWriter osw = new OutputStreamWriter(System.out);
    public static BufferedWriter bw = new BufferedWriter(osw);

    /**
     * Obtienen el nuevo rating.
     * @param Ra
     * @param W
     * @param We
     * @param K
     * @return 
     */
    public static double newRating(double Ra, double W, double We, double K) {
        return (Ra + K * (W - We));
    }

    /**
     * Imprime el encabezado del resultado.
     * @param t
     * @param n 
     */
    public static void header(String t, String n) {
        try {
            bw.write("Tournament: ");
            bw.write(t);
            bw.newLine();
            bw.write("Number of players: ");
            bw.write(n);
            bw.newLine();
            bw.write("New ratings:\n");
        } catch (IOException e) {

        }
    }

    /**
     * Imprime el nombre del usuario y el nuevo rating
     * @param line
     * @return 
     */
    public static double rating(String[] line) {
        double nR = newRating(Double.parseDouble(line[1]), Double.parseDouble(line[2]), Double.parseDouble(line[3]), Double.parseDouble(line[4]));
        try {
            bw.write(line[0]);
            bw.write(String.format(" %.0f\n", nR));
        } catch (IOException e) {

        }
        return Double.parseDouble(line[1]);
    }

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String[] line = br.readLine().split("\\s+");
        header(line[0], line[1]);
        double mR = 0.0;
        int t = Integer.parseInt(line[1]);
        for (int i = 0; i < t; i++) {
            mR += rating(br.readLine().split("\\s+"));
        }
        bw.write("Media Elo: ");
        bw.write(String.format("%.0f\n", (double) (mR / t)));
        bw.flush();
        bw.close();
    }

}