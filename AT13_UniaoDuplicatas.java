

package Atividades_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT13_UniaoDuplicatas {
    
    
    public static void main(String[] args) {
        
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite 5 números para a lista 1: ");
        
        for(int i = 0; i<5; i++){
            
            System.out.println("Número "+(i+1)+":");
            lista1.add(tc.nextInt());
        }
        
        System.out.println("Digite 5 números para a lista 2: ");
        
        for(int i = 0; i<5; i++){
            
            System.out.println("Número "+(i+1)+":");
            lista1.add(tc.nextInt());
        }
        
        ArrayList<Integer> uniao = new ArrayList<>(lista1);
        
        for(Integer num : lista2){
            if(!uniao.contains(num)){
                uniao.add(num);
                
            }
        
        }
        System.out.println("UNião das listas sem duplicatas: "+uniao);

    }
}
