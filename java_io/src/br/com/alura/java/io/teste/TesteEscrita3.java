package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscrita3 {

    public static void main(String[] args) throws IOException {

        //Fluxo de entrada de arquivos      //FileOutputStream é uma classe para escrever bytes num arquivo
//        OutputStream fos = new FileOutputStream("C:/Users/Kamilla/IdeaProjects/trilha_java/java_io/lorem2.txt");//cria o arquivo lorem2.txt
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

        PrintStream ps = new PrintStream("C:/Users/Kamilla/IdeaProjects/trilha_java/java_io/lorem2.txt");
        ps.println("Proin eget tempor nisl. Vivamus fringilla nisl condimentum.");
        ps.println();
        ps.println("shuahsuasuaauhsuahsua");
        ps.close();
    }
}
