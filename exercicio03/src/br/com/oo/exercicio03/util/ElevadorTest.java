package br.com.oo.exercicio03.util;

import br.com.oo.exercicio03.entidade.Elevador;
import br.com.oo.exercicio03.modelo.Metodos;
import org.junit.jupiter.api.Test;

//capacidade máxima programada em até 5 pessoas.

public class ElevadorTest {

    Metodos metodo = new Metodos();
    Elevador elevadorInicializa = new Elevador(0, 0); //passar os parâmetros desejados antes de iniciar os testes unitários

    //@Test
    public void testInicializaElevador() {
        String mensagem = metodo.entrar(elevadorInicializa);
        System.out.print(mensagem);
    }

    //@Test
    public void testSairElevador() {
        String mensagem = metodo.sair(elevadorInicializa);
        System.out.print(mensagem);
    }

    //@Test
    public void testSobe() {
        String mensagem = metodo.subir(elevadorInicializa);
        System.out.print(mensagem);
    }

    //@Test
    public void testDescer() {
        String mensagem = metodo.descer(elevadorInicializa);
        System.out.print(mensagem);
    }
}
