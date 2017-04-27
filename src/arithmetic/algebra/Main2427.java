/**Problem: 2427 - How Many Primes?
*  Judge: Caribbean Online Judge
*  Auth: Iván Romero Gárcia
*  Solution: generar previamente los numero primos de de 2 a N e ir contando la 
*  cantidad de números primos existentes en un rango de 1 a N.
**/
package arithmetic.algebra;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Main2427
 */
public class Main2427 {
    public static final int N = 1000000;
    public static boolean[] primeA = new boolean[N + 1];
    public static int[] countPrimeA = new int[N + 1];

    /**
     * Genera los números Primos de 2 a N
     */
    public static void SieveOfAtkin() {
        for (int x = 1; x * x < N + 1; x++) {
            for (int y = 1; y * y < N + 1; y++) {
                int n = (4 * x * x) + (y * y);
                if (n <= N  && (n % 12 == 1 || n % 12 == 5)) {
                    primeA[n] ^= true;
                }
                n = (3 * x * x) + (y * y);
                if (n <= N && n % 12 == 7) {
                    primeA[n] ^= true;
                }
                n = (3 * x * x) - (y * y);
                if (x > y && n <= N && n % 12 == 11) {
                    primeA[n] ^= true;
                }
            }
            for (int r = 5; r * r < N + 1; r++) {
                if (primeA[r]) {
                    for (int i = r * r; i < N + 1; i += r * r) {
                        primeA[i] = false;
                    }
                }
            }
        }
        primeA[2] = primeA[3] = true;
    }
    
    /**
     * Guarda un contador de al cantidad de números primos existentes en un 
     * rango de 1 a N
     */
    public static void countPrime(){
        countPrimeA[1]=0;
        for (int i = 2; i <= N; i++) {
            countPrimeA[i]+=countPrimeA[i-1];
            if(primeA[i]){
                countPrimeA[i]+=1;
            }
        }
    }
    
    /**
     * Obtiene la cantidad de numero primos de un rango de A a B
     * @param a
     * @param b
     * @return 
     */
    public static int rangePrime(int a, int b){
        return countPrimeA[b]-countPrimeA[a-1];
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        SieveOfAtkin();
        countPrime();
        while (true) {            
            String [] line = br.readLine().split("\\s+");
            if(line[0].equals("0")&& line[1].equals("0")){
                break;
            }
            bw.write(String.valueOf(rangePrime(Integer.parseInt(line[0]), Integer.parseInt(line[1]))));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}