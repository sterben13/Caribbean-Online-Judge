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
public class Main2623 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        String sb = br.readLine();
        StringBuilder a;
        int t = sb.length();
        if(t%2==0){
            a = new StringBuilder(sb.substring(0,t/2));
            bw.write(a.reverse().toString());
            a = new StringBuilder(sb.substring(t/2));
            bw.write(a.reverse().toString());
        }else{
            a = new StringBuilder(sb.substring(0,t/2));
            bw.write(a.reverse().toString());
            bw.write(sb.charAt(t/2));
            a = new StringBuilder(sb.substring(t/2+1));
            bw.write(a.reverse().toString());
        }
        bw.newLine();
        bw.flush();
        bw.close();
    }
    
}
