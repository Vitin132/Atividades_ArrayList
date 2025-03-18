package Atividades_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT14_FiltroComprimento {

    public static void main(String[] args) {

        ArrayList<String> palavras1 = new ArrayList<>();
        ArrayList<String> palavrasFiltradas = new ArrayList<>();
        
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite 10 palavras: ");
        
        for(int i = 0; i<10; i++){
            
            System.out.println("Palavra "+(i+1)+":");
            palavras1.add(tc.nextLine());
            
            
        }
        
        for(String palavra : palavras1){
            if(palavra.length() > 5){
                
                palavrasFiltradas.add(palavra);
            }
            
        }
        System.out.println("Palavras com mais de 5 caracteres: "+palavrasFiltradas);
        
        

        

        

        

    }

}
