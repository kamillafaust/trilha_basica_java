package br.com.oo.exercicio05.entidade;

public class Caminhao {

    private String tipoCaminhao;
    private Pluviometro pluviometro;

    public Caminhao() {
    }

    public String getTipoCaminhao() {
        return tipoCaminhao;
    }

    public void setTipoCaminhao(String tipoCaminhao) {
        this.tipoCaminhao = tipoCaminhao;
    }

    public Pluviometro getPluviometro() {
        return pluviometro;
    }

    public void setPluviometro(Pluviometro pluviometro) {
        this.pluviometro = pluviometro;
    }
}
