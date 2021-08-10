package br.com.oo.exercicio03.modelo;

import br.com.oo.exercicio03.entidade.Elevador;

public class Metodos {

    public String entra(Elevador elevador) {
        if (elevador.getCapacidade() < 5){
            elevador.setCapacidade(elevador.getCapacidade() + 1);
            return "Quantidade de pessoas no elevador: " + elevador.getCapacidade();
        }
        return "O elevador está lotado.";
    }

    public String sai(Elevador elevador) {
        if (elevador.getCapacidade() > 0){
            elevador.setCapacidade(elevador.getCapacidade() - 1);
            return "Quantidade de pessoas no elevador: " + elevador.getCapacidade();
        }
        return "O elevador já está vazio.";
    }

    public String sobe(Elevador elevador) {
        if (elevador.getAndarAtual() >= 0 && elevador.getAndarAtual() < 10){
            elevador.setAndarAtual(elevador.getAndarAtual() + 1);
            return "O elevador subiu para o: " + elevador.getAndarAtual() + " andar.";
        }
        return "O elevador já está no último andar.";
    }

    public String desce(Elevador elevador) {
        if (elevador.getAndarAtual() > 0 && elevador.getAndarAtual() <= 10){
            elevador.setAndarAtual(elevador.getAndarAtual() - 1);
            return "O elevador desceu para o: " + elevador.getCapacidade() + " andar.";
        }
        return "O elevador já está no térreo.";
    }
}