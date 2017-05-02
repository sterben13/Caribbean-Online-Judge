/** Problem: 2633 - Max Volume
 *  Judge: Caribbean Online Judge
 *  Auth: Iván Romero Gárcia
 *  Solution: Calcular la operacion indicada por el string e ir obteniendo el mayor.
 * */
package geometry;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Main2633
 */
public class Main2633 {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        int t = Integer.parseInt(br.readLine());
        String[] line;
        double r, h, mayor = 0, res, PI = 3.14159;
        for (int i = 0; i < t; i++) {
            line = br.readLine().split("\\s+");
            switch (line[0]) {
            case "C":
                r = Double.parseDouble(line[1]);
                h = Double.parseDouble(line[2]);
                res = (PI*r*r*h)/3;
                mayor = Math.max(mayor, res);
                break;
            case "L":
                r = Double.parseDouble(line[1]);
                h = Double.parseDouble(line[2]);
                res = PI*r*r*h;
                mayor = Math.max(mayor, res);
                break;
            case "S":
                r = Double.parseDouble(line[1]);
                res = (4*PI*r*r*r)/3;
                mayor = Math.max(mayor, res);
                break;
            }
        }
        bw.write(String.format("%.3f\n", mayor));
        bw.flush();
        bw.close();
    }
}