/** Problem: 1244 - Flowers Flourish from France
 *  Judge: Caribbean Online Judge
 *  Auth: Iván Romero Gárcia
 *  Solution: Convertir la cadena  a mayúsculas, después separara la cadena por 
 *  espacios y obtener un array de String, obtener el primer carácter de la 
 *  cadena en la posición 0 y guardarlo en un variable auxiliar y mediante un 
 *  for ir iterando el resto del array e ir comprobando el carácter en la 
 *  posición 0
 * */
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
public class Main1244 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        String line;
        String cad[];
        char aux;
        boolean im;
        while (true) {            
            line = br.readLine().toUpperCase();
            if(line.equals("*"))break;
            cad = line.split("\\s+");
            im = true;
            aux = cad[0].charAt(0);
            for (int i = 1; i < cad.length; i++) {
                if(!(aux==cad[i].charAt(0))){
                    im=false;
                    break;
                }
            }
            bw.write(im?"Y":"N");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
    
}
