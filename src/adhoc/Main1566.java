/**Problem: 
*  Judge: 
*  Url: 
*  Auth: Iván Romero Gárcia
*  Solution: 
**/
package adhoc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

/**
 * Main1566
 */
public class Main1566 {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedReader br = new BufferedReader(isr);
        BufferedWriter bw = new BufferedWriter(osw);
        int line;
        int a []=new int[500];
        a[0]=1;
        for(int i=1; i<500;i++){
            a[i] = a[i-1]+(i+1)*(i+1);
        }
        while (true) {
            line = Integer.parseInt(br.readLine());
            if(line==0)break;
            bw.write(Integer.toString(a[line-1]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}