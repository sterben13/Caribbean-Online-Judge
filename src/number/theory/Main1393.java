/**Problem: 1393 - Cruel Mathematics Teacher I
*  Judge: Caribbean Online Judge
*  Auth: Iván Romero Gárcia
*  Solution: Utilizar BigInteger y mediante u ciclo ir imprimiendo des 
*  70 en 70 los digitos del numero
**/
package number.theory;

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
public class Mian1393 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        BigInteger n;
        String [] line = br.readLine().split("\\s+");
        n= new BigInteger(line[0]);
        String power = n.pow(Integer.parseInt(line[1])).toString();
        while (power.length()>70) {            
            bw.append(power.substring(0,70));
            bw.newLine();
            power = power.substring(70);
        }
        bw.append(power);
        bw.newLine();
        bw.write("");
        bw.flush();
        bw.close();
    }
    
}
