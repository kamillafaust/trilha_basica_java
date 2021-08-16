package br.com.oo.exercicio03.modelo;

import br.com.oo.exercicio03.entidade.Elevador;

public class Metodos {

    public String entrar(Elevador elevador) {
        if (elevador.getCapacidade() < 5){
            elevador.setCapacidade(elevador.getCapacidade() + 1);
            return "Quantidade de pessoas no elevador: " + elevador.getCapacidade();
        }
        return "O elevador está lotado.";
    }

    public String sair(Elevador elevador) {
        if (elevador.getCapacidade() > 0){
            elevador.setCapacidade(elevador.getCapacidade() - 1);
            return "Quantidade de pessoas no elevador: " + elevador.getCapacidade();
        }
        return "O elevador já está vazio.";
    }

    public String subir(Elevador elevador) {
        if (elevador.getAndarAtual() >= 0 && elevador.getAndarAtual() < 10){
            elevador.setAndarAtual(elevador.getAndarAtual() + 1);
            return "O elevador subiu para o: " + elevador.getAndarAtual() + " andar.";
        }
        return "O elevador já está no último andar.";
    }

    public String descer(Elevador elevador) {
        if (elevador.getAndarAtual() > 0 && elevador.getAndarAtual() <= 10){
            elevador.setAndarAtual(elevador.getAndarAtual() - 1);
            return "O elevador desceu para o: " + elevador.getAndarAtual() + " andar.";
        }
        return "O elevador já está no térreo.";
    }
}