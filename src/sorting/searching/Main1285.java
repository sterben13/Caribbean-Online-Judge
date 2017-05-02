/**Problem: 1285 - Final Standings
*  Judge: Caribbean Online Judge
*  Auth: Iván Romero Gárcia
*  Solution: Crear una clase con los atributos de ID y problemas realizados 
*  e utilizar la clase comparador para ordenar los objetos a partir de los 
*  problemas aceptados.
**/
package sorting.searching;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Main1285
 */
public class Main1285 {

    public static class Team{
        int id;
        int m;
        public Team(String id, String m){
            this.id = Integer.parseInt(id);
            this.m = Integer.parseInt(m);
        }

        @Override
        public String toString() {
            return this.id+ " " + this.m; 
        }
        
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        int n = Integer.parseInt(br.readLine()), i;
        Team [] teams = new Team[n];
        String [] line;
        Comparator<Team> c = new Comparator<Team>() {
            @Override
            public int compare(Team o1, Team o2) {
                if(o1.m<o2.m){
                    return 1;
                }else if(o1.m>o2.m){
                    return -1;
                }else{
                    return 0;
                }
            }
        };
        for(i = 0; i < n; i++){
            line = br.readLine().split("\\s+");
            teams[i]= new Team(line[0], line[1]);
        }
        Arrays.sort(teams, c);
        for (i = 0; i < n; i++) {
            System.out.println(teams[i]);
        }
    }
}