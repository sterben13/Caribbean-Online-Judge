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
public class Main2733 {

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
        String[] st;
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            st = br.readLine().split("\\.");
            if (st.length == 4 || st.length == 6) {
                bw.write(process(st) ? "SI" : "NO");
            } else {
                bw.write("NO");
            }
            bw.newLine();
        }
        bw.flush();
        br.close();
        bw.close();

    }

    private static boolean process(String[] st) {
        int octeto;
        for (String num : st) {
            try {
                octeto = Integer.parseInt(num);
            } catch (NumberFormatException n) {
                return false;
            }
            if (octeto > 255 || octeto < 0) {
                return false;
            }
        }
        return true;
    }

}
