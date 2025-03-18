package Atividades_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT9_Duplicados {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        ArrayList<Integer> duplicatas = new ArrayList<>();
        
        Collections.addAll(duplicatas, 5, 5, 7, 25, 30, 30, 50, 100);
        HashSet<Integer> numeros = new HashSet<>(duplicatas); 
        boolean hashDuplicatas = numeros.size() != duplicatas.size();
       
        
        
        System.out.println("Lista com duplicatas:");
        System.out.println(duplicatas);
        
        System.out.println("Lista sem duplicatas");
        
        System.out.println(numeros);
        
        

        

        

        
        
        

    }

}
