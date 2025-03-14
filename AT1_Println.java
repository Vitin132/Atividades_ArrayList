

package Atividades_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT1_Println {
    
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        
        ArrayList<String> lista = new ArrayList<>();
        
        
        System.out.println("Lista de Alunos:");
        lista.add("Viamão");
        lista.add("Porto Alegre");
        lista.add("Brasília");
        lista.add("São Paulo");
        lista.add("Rio de Janeiro");
        
        for(String nome : lista){
        System.out.println(nome);
        }
        
        
        
        
        
        
    }
    
    

}
