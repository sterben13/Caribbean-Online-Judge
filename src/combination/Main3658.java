/** Problem: 
 *  Judge: Caribbean Online Judge
 *  Auth: Iván Romero Gárcia
 *  Solution: 
 * */
package combination;

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
public class Main3658 {

    static boolean comparar = false;
    static double aux[];

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        String line[] = br.readLine().split("\\s+");
        boolean flag = process(line);
        line = br.readLine().split("\\s+");
        comparar = true;
        boolean flag2 = process(line);
        bw.write((flag && flag2) ? "YES" : "NO");
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean process(String[] line) {
        double a[] = new double[3];
        for (int i = 0; i < 3; i++) {
            a[i] = Double.parseDouble(line[i]);
        }
        Arrays.sort(a);
        if (comparar) {
            if (!(a[2] == aux[2])) {
                return false;
            }
            if (!(a[1] == aux[1])) {
                return false;
            }
            if (!(a[0] == aux[0])) {
                return false;
            }
        } else {
            aux = a;
        }
        return (Math.sqrt(
                (Math.pow(a[0], 2) + Math.pow(a[1], 2)))) == a[2];
    }
}
