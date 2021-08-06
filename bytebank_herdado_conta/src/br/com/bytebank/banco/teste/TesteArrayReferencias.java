package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

    public static void main(String[] args) {

        //int [] idades = nre int[5];
        Conta[] contas = new Conta[5];

        ContaCorrente cc1 = new ContaCorrente(222, 333);
        ContaPoupanca cc2 = new ContaPoupanca(222,111);

        contas[0] = cc1;
        contas[1] = cc2;

       // Conta ref = contas[1];
        ContaPoupanca ref = (ContaPoupanca) contas[1];
        System.out.println(ref.getAgencia());


        System.out.println(contas[1].getNumero());
    }
}
