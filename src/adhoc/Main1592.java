/**Problem: 1592 - The Size is Not Important
*  Judge: Caribbean Online Judge
*  Auth: Iván Romero Gárcia
*  Solution: Utilizando la clase BitInteger podemos realizar multiplicación
*  con cantidades grandes.
**/
package adhoc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
/**
 *
 * @author rous
 */
public class Main1592 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        BigDecimal bg1;
        BigDecimal bg2;
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            bg1= new BigDecimal(br.readLine());
            bg2= new BigDecimal(br.readLine());
            bw.append(bg1.multiply(bg2).toString());
            bw.newLine();
        }
        bw.write("");
        bw.flush();
        bw.close();
    }
    
}


