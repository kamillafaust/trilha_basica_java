package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(29); //autoboxing
        System.out.println(idadeRef.intValue()); //unboxing

        Double dRef = Double.valueOf(3.2); //autoboxing
        System.out.println(dRef.doubleValue()); //unboxing

        Boolean bRef = Boolean.TRUE; //autoboxing
        System.out.println(bRef.booleanValue()); //unboxing

        Number refNumero = Integer.valueOf(29);
        Number refNumero2 = Double.valueOf(29.0);
        Number refNumero3 = Float.valueOf(29.9f);

        List<Number> lista = new ArrayList<>();
        lista.add(20);
        lista.add(25.3);
        lista.add(26.8f);
    }
}
