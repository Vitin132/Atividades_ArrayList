package Atividades_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Aluno
 */
public class AT15_InverterOrdem {

    public static void main(String[] args) {

        ArrayList<String> palavras = new ArrayList<>();
        Collections.addAll(palavras, "Pão", "Carro", "Cachorro", "Água", "Céu", "Luz");

        System.out.println("Lista das palavras com a ordem normal:");
        System.out.println(palavras);

        int tamanho = palavras.size();
        for (int i = 0; i < tamanho / 2; i++) {
            String temp = palavras.get(i);
            palavras.set(i, palavras.get(tamanho - 1 - i));
            palavras.set(tamanho - 1 - i, temp);
        }
        
        System.out.println(palavras);

    }

}
