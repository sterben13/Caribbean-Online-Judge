/**Problem: 1388 - Last Digit of A ^ B
*  Judge: Caribbean Online Judge
*  Auth: Iván Romero Gárcia
*  Solution: Las potencias tienda a crear un ciclo que se repite en tres 
*  periodos de 1, 2 y de 4, entonces lo que se debe de hacer es obtener el 
*  modulo de b y aplicar la potencia de (a^b mod 4) mod 10.
**/
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
public class Main1388 {
    public static int module(int a, char [] b){
        int mod=0;
        for(int i = 0; i < b.length; i++){
            mod=(mod*10+(b[i]-'0'))%a;
        }
        return mod;
    }

    public static int LastDigit(char a[], char b[]){
        int len_a = a.length, len_b = b.length;
        if (len_a==1 && len_b==1 && b[0]=='0' && a[0]=='0')
            return 1;
        if (len_b==1 && b[0]=='0' )
            return 1;
        if (len_a==1 && a[0]=='0')
            return 0;
        int exp = (module(4,b)==0)? 4 : module(4, b);
        int res = (int)Math.pow(a[len_a - 1] - '0', exp);
        return res % 10;
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
        String [] line;
        for(int i = 0; i < t; i++){
            line = br.readLine().split("\\s+");
            System.out.println(LastDigit(line[0].toCharArray(), line[1].toCharArray()));
        }
    }
    
}
