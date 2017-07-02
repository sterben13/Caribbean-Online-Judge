/**Problem: 
 *  Judge: Caribbean Online Judge
 *  Auth: Iván Romero Gárcia
 *  Solution: 
 * */
package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author rous
 */
public class Main1840 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            bw.write(broken(br.readLine()) ? "Secure" : "No Secure");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    private static boolean broken(String password) {
        int b,r,o,k,e,n;
        b=r=o=k=e=n=0;
        for (int i = 0; i < password.length(); i++) {
            switch (password.charAt(i)) {
                case 'B':
                    b++;
                    break;
                case 'R':
                    r++;
                    break;
                case 'O':
                    o++;
                    break;
                case 'K':
                    k++;
                    break;
                case 'E':
                    e++;
                    break;
                case 'N':
                    n++;
                    break;
            }
        }
        if(b == r && r == o && o == k && k == e && e == n){
            return false;
        }else{
            return true;
        }
    }

}
