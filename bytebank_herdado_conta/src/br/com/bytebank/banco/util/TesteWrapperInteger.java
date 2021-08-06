package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

    public static void main(String[] args) {

        int[] idades = new int[5];
        String[] nomes = new String[5];

        int idade = 29; //Integer
        Integer idadeRef = Integer.valueOf(29); //autoboxing
        System.out.println(idadeRef.doubleValue()); //transforma em double

        int valor = idadeRef.intValue(); //unboxing

        String s = args[0]; //"10" ele retorna uma string

        //Integer numero = Integer.valueOf(s);
        int numero = Integer.parseInt(s);
        System.out.println(numero);

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(idadeRef);
        numeros.add(29); //Autoboxing - transforma o primitivo em objeto

    }
}
