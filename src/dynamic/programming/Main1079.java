/** Problem: 
 *  Judge: Caribbean Online Judge
 *  Auth: Iván Romero Gárcia
 *  Solution: 
 * */
package dynamic.programming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author rous
 */
public class Main1079 {

    public static BufferedReader br;
    public static BufferedWriter bw;
    public static int a[][];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        bw = new BufferedWriter(osw);
        input();       
        bw.flush();
        bw.close();
    }

    private static void input() throws IOException{
        int t = Integer.parseInt(br.readLine());
        int n;
        String data[];
        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine());
            a = new int[n][n];
            for (int j = 0; j < n; j++) {
                data = br.readLine().split(" ");
                for (int k = 0; k < data.length; k++) {
                    a[j][k] = Integer.parseInt(data[k]);
                }
            }
            bw.write(Integer.toString(process(n)));
            bw.newLine();
        }
    }

    private static int process(int n) {
        int aux=n-2;
        for (int i = n-2; i >=0; i--) {
            for (int j = 0; j <= aux; j++) {
                a[i][j]+=Math.max(a[i+1][j], a[i+1][j+1]);
            }
            aux--;
        }
        return a[0][0];
    }

}
