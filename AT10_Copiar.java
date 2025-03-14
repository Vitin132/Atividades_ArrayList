package Atividades_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT10_Copiar {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        ArrayList<String> animais1 = new ArrayList<>();
        ArrayList<String> animais2 = new ArrayList<>();
        String animaisNovos = null;
        String resp = null;

        Collections.addAll(animais1, "Zebra", "Leão", "Tigre", "Cachorro");

        System.out.println("Lista de Animais:");
        System.out.println(animais1);

        do{
        System.out.println("Deseja adicionar um animal?");
        animaisNovos = tc.nextLine();
        animais1.add(animaisNovos);
        System.out.println(animais1);
            System.out.println("Deseja parar?s/n");
            resp = tc.nextLine();
        }while(!resp.equalsIgnoreCase("s"));
       

        animais2.addAll(animais1);
        System.out.println("Lista de animais 2:");
        System.out.println(animais2);

    }

}
