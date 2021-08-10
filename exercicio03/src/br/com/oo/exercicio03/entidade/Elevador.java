package br.com.oo.exercicio03.entidade;

public class Elevador {

    private int andarAtual;
    private int capacidade;

    public Elevador(){
    }

    public Elevador(int capacidade, int andarAtual) {
        this.capacidade = capacidade;
        this.andarAtual = andarAtual;
    }


    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
