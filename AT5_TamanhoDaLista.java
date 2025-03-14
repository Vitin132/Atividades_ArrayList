

package Atividades_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Aluno
 */
public class AT5_TamanhoDaLista {

    
    public static void main(String[] args) {
        
        ArrayList<Character> letras = new ArrayList<>();
        
        Collections.addAll(letras, 'A', 'B', 'C', 'D');
        
        for( Character lista : letras){
            System.out.println(lista);    
        }
        
        int tamanho = letras.size();
        System.out.println("A lista possui "+tamanho+" itens.");
        
        
        
    }
    
    
}
