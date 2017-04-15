/**
 * Problem: 2231 - Challenge 
 * Judge: Caribbean Online Judge 
 * Url: http://coj.uci.cu/24h/problem.xhtml?pid=2231 
 * Auth: Iván Romero Gárcia
 * Solution: mediante if checar todos los posibles exenarios del juego
 */
package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Main2231
 */
public class Main2231 {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        int t = Integer.parseInt(br.readLine());
        String line[];
        int a = 0, b = 0;
        for (int i = 0; i < t; i++) {
            line = br.readLine().split("\\s+");
            if (line[0].equals("rock")) {
                if (line[1].equals("scissors")) {
                    a++;
                }
                if (line[1].equals("paper")) {
                    b++;
                }
            }
            if (line[0].equals("scissors")) {
                if (line[1].equals("rock")) {
                    b++;
                }
                if (line[1].equals("paper")) {
                    a++;
                }
            }
            if (line[0].equals("paper")) {
                if (line[1].equals("scissors")) {
                    b++;
                }
                if (line[1].equals("rock")) {
                    a++;
                }
            }
        }
        if (a > b) {
            bw.write("A win");
        } else if (a < b) {
            bw.write("B win");
        } else {
            bw.write("tied");
        }
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
