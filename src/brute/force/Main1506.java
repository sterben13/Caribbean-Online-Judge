/**Problem: 1506 - Exam Grader
*  Judge: Caribbean Online Judge
*  Auth: Iván Romero Gárcia
*  Solution: compara las respuestas correctar e ir sacando el puntaje
**/
package brute.force;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author rous
 */
public class Main1506 {
    /**
     * 
     * @param e
     * @param a
     * @return 
     */
    public static float point(char e, char a){
        if(a=='#'){
            return 0.0f;
        }else if(e==a){
            return 1.0f;
        }else {
            return -0.25f;
        }
    }
    /**
     * @param args the command line arguments
     */   
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        int test = Integer.parseInt(br.readLine());
        String answer = br.readLine();
        int student = Integer.parseInt(br.readLine());
        String resquet;
        float score;
        for (int i = 0; i < student; i++) {
            resquet = br.readLine();
            score=0.0f;
            for (int j = 0; j < test; j++) {
                score += point(answer.charAt(j), resquet.charAt(j));
            }
            bw.write(String.format("%.2f\n", score));
        }
        bw.flush();
        bw.close();
    }
    
}