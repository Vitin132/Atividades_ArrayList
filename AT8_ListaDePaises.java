

package Atividades_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT8_ListaDePaises {

    
    public static void main(String[] args) {
        
        ArrayList<String> paises = new ArrayList<>();
        Collections.addAll(paises, "Brasil", "Portugal", "EUA", "Canadá", "Rússia");
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Lista de países:");
        System.out.println(paises);
        
        for(int i = 0; i < paises.size();  i++){
            
            System.out.println("Digite o nome de outros países: ");
            String pais = tc.nextLine();
            paises.add(pais);
            i++;
            System.out.println(paises);
            
            
        }
        
        
    }
    
    
}
