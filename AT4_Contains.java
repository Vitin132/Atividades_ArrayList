

package Atividades_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Aluno
 */
public class AT4_Contains {
    
    
    public static void main(String[] args) {
        
        ArrayList<String> cores = new ArrayList<>();
        
        Collections.addAll(cores, "Vermelho", "Verde", "Azul");
        
        for(String lista : cores){
            System.out.println(lista);
        }
        
        boolean contemAmarelo = cores.contains("Amarelo");
        System.out.println("A lista contém a cor Amarelo? "+contemAmarelo);
        
        
    }
    

}
