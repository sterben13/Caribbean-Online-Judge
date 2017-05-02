/**Problem: 1407 - Julka
*  Judge: Caribbean Online Judge
*  Auth: Iván Romero Gárcia
*  Solution: Utilizando BigInteger, solo se realizo las siguientes dos formulas para
*  obtener el menor  es: n-k/2 y el mayor: n + k.
**/
package adhoc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

/**
 * Main1407
 */
public class Main1407 {

    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        BigInteger mayor, menor, div2= new BigInteger("2"), k, n;
        for(int i = 0; i < 10; i++){
            n = new BigInteger(br.readLine());
            k = new BigInteger(br.readLine());
            menor = n.subtract(k).divide(div2);
            mayor = menor.add(k);
            bw.write(mayor.toString());
            bw.newLine();
            bw.write(menor.toString());
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}