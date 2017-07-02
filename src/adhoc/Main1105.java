/**Problem: 
*  Judge: 
*  Url: 
*  Auth: Iván Romero Gárcia
*  Solution: 
**/
package adhoc;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Main1105
 */
public class Main1105 {
    
    public static int FindDiagonal(int n){
	    return (int)(Math.sqrt(8*n+1))/2;
    }

    public static int endPoint(int n){
        return (int)(Math.pow(n, 2)+n)/2;
    }
    
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        System.out.println(FindDiagonal(14));
        System.out.println(endPoint(5)-14);

    }    
}