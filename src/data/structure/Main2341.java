/**Problem: 2341 - Big List
*  Judge: Caribbean Online Judge
*  Url: http://coj.uci.cu/24h/problem.xhtml?pid=2341
*  Auth: Iván Romero Gárcia
*  Solution: Guardar en un mapa las operaciones y las repuestas, posteriromente ir checando la 
*  si las operaciones existen y las repuestas dadas son las correctas.
**/
package data.structure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.HashMap;

/**
 * Main2341
 */
public class Main2341 {

    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        Map<String, String> questions = new HashMap<>();
        String line[];
        line = br.readLine().split("\\s+");
        int m, n;
        m=Integer.parseInt(line[0]);
        n=Integer.parseInt(line[1]);
        for(int i = 0; i < m; i++){
            line = br.readLine().split("\\s+");
            questions.put(line[0], line[1]);
        }
        for(int i = 0; i < n; i++){
            line = br.readLine().split("\\s+");
            if(questions.containsKey(line[0])){
                if(questions.get(line[0]).equals(line[1])){
                    bw.write("ok");
                }else{
                    bw.write("wrong");
                }
            }else{
                bw.write("not found");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}

