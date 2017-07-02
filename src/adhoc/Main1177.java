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

/**
 *
 * @author rous
 */
public class Main1177 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        StringBuilder auxSB;
        String line[];
        int g;
        while (true) {            
            line = br.readLine().split(" ");
            if(line[0].equals("0"))break;
            g = line[1].length()/Integer.parseInt(line[0]);
            for (int i = 0; i < line[1].length(); i+=g) {
                auxSB = new StringBuilder(line[1].substring(i,i+g));
                bw.write(auxSB.reverse().toString());
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
    
}
