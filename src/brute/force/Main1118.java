/** Problem: 1118 - The Drunk Jailer
 *  Judge: Caribbean Online Judge
 *  Auth: Iván Romero Gárcia
 *  Solution: el problema solo te pide la cantidad de prisioneros que se escaparon. Eso se   
 *  realiza a partir de un ciclo for de i= 2 hasta 101 e ir cambiando los valores del bitset.
 * */
package brute.force;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.util.BitSet;

/**
 * Main1118
 */
public class Main1118 {

    public static BitSet cell;
    public static final int t = 101;

    /**
     *
     */
    public static void openCell() {
        cell = new BitSet(t);
        for (int i = 2; i < t; i++) {
            for (int j = i; j < t; j += i) {
                cell.set(j, !cell.get(j));
            }
        }
    }

    /**
     *
     * @param n
     * @return
     */
    public static int scapeCount(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!cell.get(i)) {
                count++;
            }
        }
        return count;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        try (BufferedReader br = new BufferedReader(isr)) {
            try (BufferedWriter bw = new BufferedWriter(osw)) {
                int test = Integer.parseInt(br.readLine());
                int n;
                openCell();
                for (int i = 0; i < test; i++) {
                    n = Integer.parseInt(br.readLine());
                    bw.write(String.valueOf(scapeCount(n)));
                    bw.newLine();
                }
                bw.flush();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
