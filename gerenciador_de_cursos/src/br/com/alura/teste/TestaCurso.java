package br.com.alura.teste;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções em Java", "Paulo Silveira");
//        List<Aula> aulas = javaColecoes.getAulas();
//        System.out.println(aulas);

        //não será possível rodar assim, pois na classe Curso foi colocado um método unmodifiableList para
        //que não seja possível mexer no atributo diretamente sem passar pelo novo método de adicionarNaLista
        //javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));

        //com novo método criado na classe para adicionar curso
        javaColecoes.adicionaNaLista(new Aula("Curso de Java", 22));
        javaColecoes.adicionaNaLista(new Aula("Curso de Python", 24));
        javaColecoes.adicionaNaLista(new Aula("Curso de JavaScript", 20));

        System.out.println(javaColecoes.getAulas());

    }
}
