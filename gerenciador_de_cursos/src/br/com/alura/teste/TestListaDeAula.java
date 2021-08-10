package br.com.alura.teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class TestListaDeAula {

    public static void main(String[] args) {
        Aula a1 = new Aula("Revisando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de objetos", 15);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);
        Collections.sort(aulas);
        Collections.sort(aulas, Comparator.comparing(Aula::getTempo)); //comparando pelo tempo
        System.out.println(aulas);
    }
}
