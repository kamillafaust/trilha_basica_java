package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteTributaveis {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100.0);

        br.com.bytebank.banco.modelo.SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto calculoImposto = new CalculadorDeImposto();
        calculoImposto.registra(cc);
        calculoImposto.registra(seguro);

        System.out.println(calculoImposto.getTotalImposto());
    }
}
