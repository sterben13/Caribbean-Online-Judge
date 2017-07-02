/** Problem: 
 *  Judge: Caribbean Online Judge
 *  Auth: Iván Romero Gárcia
 *  Solution: 
 * */
package combination;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

/**
 *
 * @author rous
 */
public class Main3659 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        BigInteger fact = new BigInteger("1");
        BigInteger [] arrayFact = new BigInteger[41];
        arrayFact[0] = fact;
        for (int i = 1; i < 41; i++) {
            fact = fact.multiply(new BigInteger(""+i));
            arrayFact[i]=fact;
        }
        int t = Integer.parseInt(br.readLine());
        int n;
        for (int i = 0; i < t; i++) {
            n=Integer.parseInt(br.readLine());
            bw.write(arrayFact[n].toString());
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
