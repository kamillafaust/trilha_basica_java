package br.com.oo.exercicio05.entidade;

import java.util.List;

public class Pluviometro {

    private int quantidade;
    private List<String> listaPluviometros;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public List<String> getListaPluviometros() {
        return listaPluviometros;
    }

    public void setListaPluviometros(List<String> listaPluviometros) {
        this.listaPluviometros = listaPluviometros;
    }
}
