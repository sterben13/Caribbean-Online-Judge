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
public class Main1160 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        int t = Integer.parseInt(br.readLine()), x, y;
        String line [];
        String im;
        for (int i = 0; i < t; i++) {
            line = br.readLine().split(" ");
            x=Integer.parseInt(line[0]);
            y=Integer.parseInt(line[1]);
            if(x==y){
                if(x%2==0){
                  im =Integer.toString(x*2);  
                }else{
                    im =Integer.toString((x*2)-1);  
                }
            }else if(y==(x-2)){
                if(x%2==0){
                  im =Integer.toString(x+y);  
                }else{
                    im =Integer.toString((x+y)-1);  
                }
            }else{
                im="No Number";
            }
            bw.write(im);
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
