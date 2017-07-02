/**Problem: 
*  Judge: 
*  Url: 
*  Auth: Iván Romero Gárcia
*  Solution: 
**/
package adhoc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.File;
import java.io.FileInputStream;

/**
 * Main1070
 */
public class Main1070 {

    public static void main(String[] args) throws IOException {
        String path = new File(".").getCanonicalPath() + "/datos.txt";
        FileInputStream fis = new FileInputStream(path);
        InputStreamReader isr = new InputStreamReader(fis);
        //InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        int n, ans1, ans2, b, c;
        while (br.ready()) {
            n = Integer.parseInt(br.readLine());
            ans1 = 0;
            ans2 = 0;
            for (int i = 1; i <= n; i++)
                for (int j = 1; j <= n; j++)
                    ans2 = ans2 + i * j;
            ans1 = n * (n + 1);
            ans1 = ans1 / 2;
            b = ans1;
            c = 0;
            for (int i = 2; i <= n; i++) {
                c = c + i - 1;
                ans1 = ans1 + b - c;
            }
            bw.write(Integer.toString(ans1));
            bw.write(" ");
            bw.write(Integer.toString(ans2));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}