

package Atividades_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Aluno
 */
public class AT8_ListaDePaises {

    
    public static void main(String[] args) {
        
        ArrayList<String> paises = new ArrayList<>();
        Collections.addAll(paises, "Brasil", "Portugal", "EUA", "Canadá", "Rússia");
        
        System.out.println("Lista de países:");
        
        for(String lista : paises){
            
            
            System.out.println(lista);
            
        }
        
        
    }
    
    
}
