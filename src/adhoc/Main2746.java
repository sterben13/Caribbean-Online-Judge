/**Problem: 2746 - Flea ́s Festival of Reading
*  Judge: Caribbean Online Judge
*  Auth: Iván Romero Gárcia
*  Solution: por cada string obtener la cantidad de vocales y consonantes.
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
public class Main2746 {

    /**
     * Verifica si un caracter es vocal
     * @param c
     * @return boolean
     */
    public static boolean isBowel(char c) {
        return c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
    }
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
        String word = br.readLine();
        int length = word.length(), cont=0;
        for (int i = 0; i < length; i++) {
            if (isBowel(word.charAt(i))) {
                cont++;
            }
        }
        bw.write(cont+" "+(length-cont));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
    
}
