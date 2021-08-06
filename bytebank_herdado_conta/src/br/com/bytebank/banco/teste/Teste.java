package br.com.bytebank.banco.teste;

public class Teste {

        //Array
        public static void main(String[] args) {

            int[] idades = new int[5]; //inicializa o array com 0

//            idades[0] = 29;
//            idades[1] = 39;
//            idades[2] = 19;
//            idades[3] = 99;
//            idades[4] = 59;
//
//            int idade4 = idades[4];
//            System.out.println(idade4);

            for (int i = 0; i < idades.length; i++) {
                idades[i] = i * i;

            }

        }
}

