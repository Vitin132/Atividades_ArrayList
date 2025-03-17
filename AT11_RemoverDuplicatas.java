

package Atividades_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT11_RemoverDuplicatas {

    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        Scanner tc2 = new Scanner(System.in);
        int numRemove = 0;
        String resp = null;
        ArrayList<Integer> num = new ArrayList<>();
        
        Collections.addAll(num, 1, 1, 2, 3, 4, 5, 6, 7, 8, 8 );
        
        
        System.out.println("Lista de Números:");
        System.out.println(num);
        
        do{
        System.out.println("Remova as duplicatas.");
        numRemove = tc.nextInt();
        
        num.remove(numRemove);
        
            System.out.println("Todas as duplicatas foram removidas?s/n");
            resp = tc2.nextLine();
            
        }while(!resp.equalsIgnoreCase("s"));
        System.out.println(num);
    }
    
    
    
}
