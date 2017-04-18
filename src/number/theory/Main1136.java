/** Problem: 1136 - Prime Generator
 *  Judge: Caribbean Online Judge
 *  Auth: Iván Romero Gárcia
 *  Solution: se creo una funcion para generar numeros primos de los indices 
 *  i a j y otra funcion *  para verifica si el indice i es un numero primo
 * */
package number.theory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author rous
 */
public class Main1136 {

    public static InputStreamReader isr = new InputStreamReader(System.in);
    public static BufferedReader br = new BufferedReader(isr);
    public static OutputStreamWriter osw = new OutputStreamWriter(System.out);
    public static BufferedWriter bw = new BufferedWriter(osw);

    /**
     * Funcion para generar los numeros primos desde i hasta j
     * @param i
     * @param j 
     */
    private static void primeGenerator(int i, int j) {
        for (; i <= j; i++) {
            if (isPrime(i)) {
                try {
                    bw.write(String.valueOf(i));
                    bw.newLine();
                } catch (IOException ex) {
                }
            }
        }
    }

    /**
     * Funcion booleana para verificar si un numero es primo
     * @param n
     * @return boolean
     */
    private static boolean isPrime(int n) {
        if(n==1){
            return false;
        }
        if ((n & 1) == 0 && n != 2) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int t = Integer.parseInt(br.readLine());
            String[] line;
            for (int i = 0; i < t; i++) {
                line = br.readLine().split("\\s+");
                primeGenerator(Integer.parseInt(line[0]), Integer.parseInt(line[1]));
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException ex) {

        }
    }
}
