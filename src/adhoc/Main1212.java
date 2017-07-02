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
 *
 * @author rous
 */
public class Main1212 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        String line, data[];
        double suma;
        int cont;
        while (true) {
            line = br.readLine();
            if (line.equals("*")) {
                break;
            }
            data = line.split("[/]");
            cont = 0;
            for (String data1 : data) {
                suma = 0;                
                for (int i = 0; i < data1.length(); i++) {
                    suma+=conver(data1.charAt(i));
                }
                if(suma==1.0){
                    cont++;
                }
            }
            bw.write(Integer.toString(cont));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    public static double conver(char c) {
        switch (c) {
            case 'W':
                return 1.0;
            case 'H':
                return 1.0 / 2.0;
            case 'Q':
                return 1.0 / 4.0;
            case 'E':
                return 1.0 / 8.0;
            case 'S':
                return 1.0 / 16.0;
            case 'T':
                return 1.0 / 32.0;
            case 'X':
                return 1.0 / 64.0;
        }
        return 0;
    }

}
