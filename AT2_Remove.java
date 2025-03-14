

package Atividades_ArrayList;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class AT2_Remove {

    
    public static void main(String[] args) {
        
        ArrayList<Integer> lista = new ArrayList<>();
        
        System.out.println("Lista de números:");
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);
        
        lista.removeIf(n -> n % 2 == 0); 
         
        for(Integer num : lista){
            System.out.println(num);
        
            
            
            
        }
        
        
        
    }
    
    
    
}
