package coj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Main3695
 */
public class Main3698 {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        String line = br.readLine().split("\\s+")[1];
        int uppercase = 0;
        int lowercase = 0;
        for (int i = 0; i < line.length(); i++) {
            if ((line.charAt(i) >= 'a') && (line.charAt(i) <= 'z')) {
                lowercase++;
            }else{
                uppercase++;
            }
        }
        bw.append(Integer.toString(uppercase));
        bw.append(" ");
        bw.append(Integer.toString(lowercase));
        bw.newLine();
        bw.write("");
        bw.flush();
        bw.close();
    }
}