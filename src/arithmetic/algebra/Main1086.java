/**Problem: 1086 - Eliminating Numbers
*  Judge: Caribbean Online Judge
*  Auth: Iván Romero Gárcia
*  Solution: Ulilizar la criba de aktin para generar los numeros primos,
*  crear un arreglo para ir contando lo numeros primos de 2 a N.
**/
package arithmetic.algebra;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.BitSet;

/**
 * Main1086
 */
public class Main1086 {
    public static int [] prime;
    public static boolean [] array;
    public static int n = 4567891;
        
    public static void primo(int k) {
		int limite = k,n,x,y;
		array = new boolean[limite + 1];
		for (int i = 1; i * i <= limite; i++) {
			x = i * i;
			for (int j = 1; j * j <= limite; j++) {
				y = j * j;
				n = 4 * x + y;
				if(n <= limite && (n % 12 == 1 || n % 12 == 5))
					array[n] = true;
				n = 3 * x + y;
				if(n <= limite && n % 12 == 7)
					array[n] = true;
				n = 3 * x - y;
				if(x > y && n <= limite && n % 12 == 11)
					array[n] = true;
			}
		}
		for (int i = 5; i * i <= limite; i+=2)
			if(array[i]) 					
				for (int j = 2; i * j < array.length; j++) 
					array[i * j] = false;			
		array[2] = true;
		array[3] = true;		
	}
    
    public static void counting(){
        prime = new int [n];
        for (int i = 2; i <n ; i++) {
            prime[i]+=prime[i-1];
            if(array[i]){
                prime[i]++;
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        primo(4567890);
        counting();
        for (int i = 0; i < 10; i++) {
            bw.write(String.valueOf(prime[Integer.parseInt(br.readLine())]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}