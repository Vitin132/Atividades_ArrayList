

package Atividades_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Aluno
 */
public class AT6_Substituir {

    public static void main(String[] args) {
        
        ArrayList<String> listaFrutas = new ArrayList<>();
        
        Collections.addAll(listaFrutas, "Banana", "Maçã", "Uva", "Pêssego");
        
        //for(String lista : listaFrutas){
        //    System.out.println(lista);
            
        //}
        
        System.out.println(listaFrutas);
        
        listaFrutas.set(2, "Morango");
        
        System.out.println(listaFrutas);
        
        
        
    }
    
    
    
}
