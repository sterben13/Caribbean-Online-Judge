/**Problem: 1038 - Digits
*  Judge: Caribbean Online Judge
*  Auth: Iván Romero Gárcia
*  Solution: Mediante un ciclo ir contando cuando el numero de dígitos es mayor a 1.
**/
package adhoc;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Main1038
 */
public class Main1038 {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        String line;
        int cont;
        while (true) {
            line = br.readLine();
            if (line.equals("END"))
                break;
            cont = 1;
            while (!line.equals("1")) {
                line = String.valueOf(line.length());
                cont++;
            }
            bw.append(String.valueOf(cont));
            bw.newLine();
        }
        bw.write("");
        bw.flush();
        bw.close();
    }
}