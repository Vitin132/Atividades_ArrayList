

package Atividades_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Aluno
 */
public class AT7_OrdenarElementos {

    public static void main(String[] args) {
        
        ArrayList<Integer> listaNum = new ArrayList<>();
        
        Collections.addAll(listaNum, 5, 8, 10, 30, 25, 15, 50, 45, 32, 41);
        
        Collections.sort(listaNum);
        
        System.out.println(listaNum);
        
        
    }
    
    
    
    
}
