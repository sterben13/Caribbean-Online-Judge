/** Problem: 
 *  Judge: Caribbean Online Judge
 *  Auth: Iván Romero Gárcia
 *  Solution: 
 * */
package combination;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

/**
 *
 * @author rous
 */
public class Main1376 {
    public static char line[];

    public static void swap(int i, int j) {
        char aux = line[i];
        line[i] = line[j];
        line[j] = aux;
    }

    public static void selectionSord(int init, int n) {
        int iAux;
        for (int i = init; i < n - 1; i++) {
            iAux = i;
            for (int j = iAux + 1; j < n; j++)
                if (line[iAux] > line[j])
                    iAux = j;
            swap(iAux, i);
        }
    }

    public static void findNext(int n) throws IOException{    
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        int i, j;
        for (i = n - 1; i > 0; i--) {
            if (line[i] > line[i - 1]) {
                break;
            }
        }
        if(i==0){
            bw.write("0");
            bw.newLine();
            bw.flush();
            bw.close();
            return;
        }
        int x = line[i - 1], smallest = i;
        for (j = i + 1; j < n; j++)
            if (line[j] > x && line[j] < line[smallest])
                smallest = j;
        swap(smallest, i-1);
        selectionSord(i, line.length);
        for (char line1 : line) {
            bw.write(line1);
        }
        bw.newLine();
        bw.flush();
        bw.close();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        line = br.readLine().toCharArray();
        findNext(line.length);
        
    }
}
