/** Problem: 1597 - Average
 *  Judge: Caribbean Online Judge
 *  Auth: Iván Romero Gárcia
 *  Solution: Ordenar el arreglo sumar  desde l hasta n-h y dividir la 
 *  sudatoria entre /n-(h+l)
 * */
package sorting.searching;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 *
 * @author rous
 */
public class Main1597 {

    public static int[] a;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        int h, l, n;
        String[] line;
        double suma;
        while (true) {
            line = br.readLine().split("\\s+");
            h = Integer.parseInt(line[0]);
            l = Integer.parseInt(line[1]);
            n = Integer.parseInt(line[2]);
            if (h + l + n == 0) {
                break;
            }
            a = new int[n];
            line = br.readLine().split("\\s+");
            for (int i = 0; i < line.length; i++) {
                a[i] = Integer.parseInt(line[i]);
            }
            Arrays.sort(a);
            suma = 0.0;
            for (int i = l; i < n-h; i++) {
                suma+=a[i];
            }
            bw.write(String.format("%.6f", (suma/(n-(h+l)))));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

}
