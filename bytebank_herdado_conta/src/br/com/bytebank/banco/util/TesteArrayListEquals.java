package br.com.bytebank.banco.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {

    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<>();

        Conta cc = new ContaCorrente(222,333);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(555,111);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(555,111);
        boolean existe = lista.contains(cc3);

        System.out.println("Já existe? " + existe);

        for (Conta conta: lista) {

                System.out.println(conta);
        }
    }
}
