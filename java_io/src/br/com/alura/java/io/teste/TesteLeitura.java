package br.com.alura.java.io.teste;

import java.io.*;

public class TesteLeitura {
                                                   //exceção caso nao exista o arquivo
    public static void main(String[] args) throws IOException { //FileNotFoundException |  IOException é o mais genérico
        //Fluxo de entrada com arquivo

        FileInputStream fis = new FileInputStream("C:/Users/Kamilla/IdeaProjects/trilha_java/java_io/lorem.txt"); //essa classe tem a entrada do arquivo mas a leitura devolve em inteiro
        InputStreamReader isr = new InputStreamReader(fis); //classe q transforma o int (bits, bytes) em caracter
        BufferedReader br = new BufferedReader(isr); //ler os caracteres até preencher a linda, trazer a linha toda

        String linha = br.readLine();

        while(linha != null){
            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();

    }
}
