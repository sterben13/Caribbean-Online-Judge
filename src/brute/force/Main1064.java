/** Problem: 1064 - Alarm Clock 
 *  Judge: Caribbean Online Judge
 *  Auth: Iván Romero Gárcia
 *  Solution: Realizar un serie de comparación entre las horas y los minuto 
 *  para hacer la correspondiente operación.
 * */
package brute.force;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author rous
 */
public class Main1064 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        String[] data;
        int h1, m1, h2, m2;
        int totalMin;
        while (true) {
            data = br.readLine().split(" ");
            h1 = Integer.parseInt(data[0]);
            m1 = Integer.parseInt(data[1]);
            h2 = Integer.parseInt(data[2]);
            m2 = Integer.parseInt(data[3]);
            if(h1+m1+h2+m2==0)break;
            if(h1==h2){
                if(m1>=m2){
                    totalMin = 1440-(m1-m2);
                }else{
                    totalMin = m2-m1;
                }
            }else if(h1>h2){
                if(m1>=m2){
                    totalMin= ((24-(h1-h2))*60)-(m1-m2);
                }else{
                    totalMin= ((24-(h1-h2))*60)+(m2-m1);
                }
            }else{
                if(m1>=m2){
                    totalMin= ((h2-h1)*60)-(m1-m2);
                }else{
                    totalMin = ((h2-h1)*60)+(m2-m1);
                }
            }
            bw.write(Integer.toString(totalMin));
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
/*
1 5 3 5
23 59 0 34
21 33 21 10
0 0 0 0
*/