package br.com.bytebank.banco.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.LinkedList;
import java.util.List;

public class TesteArrayLinkedList {

    public static void main(String[] args) {

        List<Conta> lista = new LinkedList<Conta>();

        Conta cc = new ContaCorrente(22,11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22,22);
        lista.add(cc2);

        System.out.println("Tamanho: " + lista.size());
        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);

        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(22, 66);
        lista.add(cc3);

        for (int i = 0; i < lista.size(); i++) {
            Object oRef = lista.get(i);
            System.out.println(oRef);

        }
    }
}
