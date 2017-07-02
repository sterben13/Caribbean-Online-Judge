/**Problem: 
 *  Judge: Caribbean Online Judge
 *  Auth: Iván Romero Gárcia
 *  Solution: 
 * */
package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author rous
 */
public class Main1991 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        int t = Integer.parseInt(br.readLine());
        String line;
        int a[];
        for (int i = 0; i < t; i++) {
            bw.write(br.readLine());
            bw.write(" ");
            line = br.readLine();
            a = procesar(line);
            for (int j = 0; j < a.length; j++) {
                bw.write(Integer.toString(a[j]));
                bw.write(" ");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    private static int [] procesar(String line) {
        String aux;
        int[] a = new int[8];
        for (int i = 0; i < line.length() - 2; i++) {
            aux = line.substring(i, i + 3);
            switch (aux) {
                case "TTT":
                    a[0] += 1;
                    break;
                case "TTH":
                    a[1] += 1;
                    break;
                case "THT":
                    a[2] += 1;
                    break;
                case "THH":
                    a[3] += 1;
                    break;
                case "HTT":
                    a[4] += 1;
                    break;
                case "HTH":
                    a[5] += 1;
                    break;
                case "HHT":
                    a[6] += 1;
                    break;
                case "HHH":
                    a[7] += 1;
                    break;
            }
        }
        return a;
    }
    

}
