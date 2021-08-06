package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscrita {

    public static void main(String[] args) throws IOException {

        //Fluxo de entrada de arquivos      //FileOutputStream é uma classe para escrever bytes num arquivo
        OutputStream fos = new FileOutputStream("C:/Users/Kamilla/IdeaProjects/trilha_java/java_io/lorem2.txt");//cria o arquivo lorem2.txt
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Proin eget tempor nisl. Vivamus fringilla nisl condimentum dolor molestie imperdiet.");
        bw.newLine();
        bw.newLine();
        bw.write("shuahsuasuaauhsuahsua");

        bw.close();
    }
}
