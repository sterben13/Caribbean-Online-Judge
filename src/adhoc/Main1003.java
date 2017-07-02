/**Problem: 
*  Judge: 
*  Url: 
*  Auth: Iván Romero Gárcia
**/
package adhoc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.BitSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rous
 */
public class Main1003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BitSet bs = new BitSet();
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        String data[];
        int m, n;
        short t = Short.parseShort(br.readLine());
        int indice = 0;
        for (int k = 0; k < t; k++) {
            data = br.readLine().split(" ");
            m = Integer.parseInt(data[0]);
            n = Integer.parseInt(data[1]);
            int v[] = new int[m];
            for (int i = 0; i < n; i++) {
                data = br.readLine().split(" ");
                for (int j = 0; j < data.length; j++) {
                    v[j] += Integer.parseInt(data[j]);
                }
            }
            int mayor = 0;
            int candidato= 0;
            for (int i = 0; i < v.length; i++) {
                if(mayor<v[i]){
                    mayor=v[i];
                    candidato=i;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(candidato+1).append("\n");
            bw.write(sb.toString());
            bw.flush();
        }
        bw.close();
    }
}
