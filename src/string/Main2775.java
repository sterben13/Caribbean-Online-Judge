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
public class Main2775 {

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
        StringBuilder sb;
        int t = Integer.parseInt(br.readLine());
        String regex = "[aeiou][a-z]*";
        for (int i = 0; i < t; i++) {
            sb = new StringBuilder(br.readLine());
            if(sb.toString().matches(regex)){               
                sb.append("cow");
            }else{
                sb.append(sb.charAt(0))
                        .append("ow")
                        .deleteCharAt(0);
            }
            bw.write(sb.toString());
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
    
}
