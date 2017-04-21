/**Problem: 3073 - Way Too Long Words
*  Judge: Caribbean Online Judge
*  Auth: Iván Romero Gárcia
*  Solution: Obtener el tamaño de la palabra si la tamaño es meno o igual a 10 
*  imprimir la palabra si no abreviar utilizando 
*  el primer carácter + tamaño-2 + ultimo carácter. 
**/
package adhoc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Main3073
 */
public class Main3073 {
    /**
     * Abrevia la palabra utilizando el primer carácter + length-2 + ultimo 
     * carácter
     * @param word
     * @return 
     */
    public static StringBuilder spelt(String word) {
        int n = word.length();
        return new StringBuilder().append(word.charAt(0)).append(n-2).append(word.charAt(n-1));
    }

    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        String word;
        try {
            int t = Integer.parseInt(br.readLine());
            for (int i = 0; i < t; i++) {
                word = br.readLine();
                if (word.length() > 10) {
                    bw.write(spelt(word).toString());
                } else {
                    bw.write(word);
                }
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {

        }
    }
}