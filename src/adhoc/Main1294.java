/**Problem: 1294 - Jolly Jumpers
*  Judge: Caribbean Online Judge
*  Auth: Iván Romero Gárcia
*  Solution: Utilizar un array de boolean para marcar de 1 a n-1;
**/
package adhoc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.File;
import java.io.FileInputStream;

/**
 * Main1294
 */
public class Main1294 {
    public static void main(String[] args) throws IOException {
        String path = new File("src/adhoc/input.txt").getAbsolutePath();
        FileInputStream fis = new FileInputStream(path);
        InputStreamReader isr = new InputStreamReader(fis);
        //InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        String [] line;
        boolean [] number;
        boolean flat;
        int a, b;
        while(br.ready()){
            line = br.readLine().split("\\s+");
            int n = Integer.parseInt(line[0]);
            number = new boolean[n];
            for (int i = 1; i < n; i++) {
                a= Integer.parseInt(line[i]);
                b= Integer.parseInt(line[i+1]);
                if(Math.abs(a-b)<n){
                    number[Math.abs(a-b)]=true;
                }
            }
            flat = true;
            for (int i = 1; i < n; i++) {
                if(!number[i]){
                    flat=false;
                }
            }
            if(flat){
                System.out.println("Jolly");

            }else{
                System.out.println("Not jolly");
            }
        }
    }
}