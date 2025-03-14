package Atividades_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT9_Duplicados {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> duplicatas = new ArrayList<>();
        Collections.addAll(numeros, 5, 5, 7, 25, 30, 30, 50, 100);

        for (Integer lista : numeros) {
            System.out.println(lista);

        }

        System.out.println("Digite um número");
        int num = tc.nextInt();

        numeros.add(num);

        do {
            Collections.sort(numeros);
            System.out.println(numeros);
            System.out.println("Digite outro número:");
            num = tc.nextInt();
            numeros.add(num);
            num++;
        } while (num >= 0);

        
        
        

    }

}
