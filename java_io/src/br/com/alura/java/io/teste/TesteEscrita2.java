package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscrita2 {

    public static void main(String[] args) throws IOException {

        //Fluxo de entrada de arquivos      //FileOutputStream é uma classe para escrever bytes num arquivo
//        OutputStream fos = new FileOutputStream("C:/Users/Kamilla/IdeaProjects/trilha_java/java_io/lorem2.txt");//cria o arquivo lorem2.txt
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

        FileWriter fw = new FileWriter("C:/Users/Kamilla/IdeaProjects/trilha_java/java_io/lorem2.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Proin eget tempor nisl. Vivamus fringilla nisl condimentum dolor molestie imperdiet.");
        bw.write(System.lineSeparator());
        bw.write(System.lineSeparator()); //para separar linha tbm, roda em todos os sistemas operacionais
      //fw.write("\r\n");
        bw.write("shuahsuasuaauhsuahsua");

        bw.close();
    }
}
