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
public class Main1099 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        while(true){
            String [] line = br.readLine().split(" ");
            if(line[0].equals("0")){
                break;
            }
            double a = Math.pow(Double.parseDouble(line[0]), 2);
            double b = Math.pow(Double.parseDouble(line[1]), 2);
            double c = Math.pow(Double.parseDouble(line[2]), 2);
            boolean imp = false;
            if(a+b==c){
                imp=true;
            }else if(a+c==b){
                imp=true;
            }else if(c+b==a){
                imp=true;
            }
            bw.write(imp?"right\n":"wrong\n");
        }
        bw.close();
    }
}
