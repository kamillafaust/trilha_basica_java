package br.com.oo.exercicio03.util;

import br.com.oo.exercicio03.entidade.Elevador;
import br.com.oo.exercicio03.modelo.Metodos;
import org.junit.jupiter.api.Test;


public class ElevadorTest {

    Metodos metodo = new Metodos();
    Elevador elevadorInicializa = new Elevador(3, 4);

    //@Test
    public void testInicializaElevador() {
        String mensagem = metodo.entra(elevadorInicializa);
        System.out.println(mensagem);
    }

    //@Test
    public void testSairElevador() {
        String mensagem = metodo.sai(elevadorInicializa);
        System.out.println(mensagem);
    }

    //@Test
    public void testSobe() {
        String mensagem = metodo.sobe(elevadorInicializa);
        System.out.println(mensagem);
    }

    //@Test
    public void testDesce() {
        String mensagem = metodo.desce(elevadorInicializa);
        System.out.println(mensagem);
    }

}
