/**Problem: 2946 - Inverting the Parity
*  Judge: Caribbean Online Judge
*  Auth: Iván Romero Gárcia
*  Solution: Utilizando operaciones de bit se realizan la conversión de par a 
*  impar y viceversa.
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
public class Main2946 {
    
    /**
     * Convierte un numero impar a par.
     * @param n
     * @return 
     */
    public static int convertEven(int n){
        while ((n&1)!=0){
            n=n<<1;
        }
        return n;
    }
    
    /**
     * Convierte un numero par a impar.
     * @param n
     * @return 
     */
    public static int convertOdd(int n){
        while ((n&1)!=1){
            n=n>>1;
        }
        return n;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        int t = Integer.parseInt(br.readLine());
        int n;
        for (int i = 0; i < t; i++) {
            n= Integer.parseInt(br.readLine());
            if((n&1)==0){
                bw.write(String.valueOf(convertOdd(n)));
            }else{
                bw.write(String.valueOf(convertEven(n)));
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }   
}