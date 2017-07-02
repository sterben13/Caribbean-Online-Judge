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
import java.util.SortedMap;
import java.util.TreeMap;


/**
 *
 * @author rous
 */
public class Main2712 {

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
        SortedMap<String, Integer> map = new TreeMap<>();
        int t = Integer.parseInt(br.readLine());
        String [] line;
        for (int i = 0; i < t; i++) {
            line = br.readLine().split("\\s+");
            if(map.containsKey(line[1])){
                map.put(line[1], (map.get(line[1])+1));
            }else{
                map.put(line[1], 1);
            }
        }
        t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            line = br.readLine().split("\\s+");
            if(map.containsKey(line[1])){
                bw.write(Integer.toString(map.get(line[1])));
            }else{
                bw.write("0");
            }
            bw.newLine();
        }
        bw.flush();
        br.close();
        bw.close();
    }

}
