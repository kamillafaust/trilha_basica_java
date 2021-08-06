package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;

public class ContaEspecial extends Conta {


    public ContaEspecial(int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor; //só funciona pq o saldo ta como protected, que é visível para os filhos
                              //quando estão em pacotes diferentes
    }
}
