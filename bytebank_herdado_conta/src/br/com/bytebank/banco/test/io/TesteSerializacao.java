package br.com.bytebank.banco.test.io;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.io.*;

public class TesteSerializacao {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Cliente cliente = new Cliente();
        cliente.setNome("Kamilla");
        cliente.setProfissao("Dev");
        cliente.setCpf("44523232334");

        ContaCorrente cc = new ContaCorrente(222,333);
        cc.deposita(100);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Users/Kamilla/IdeaProjects/trilha_java/java_io/cc.bin"));
        oos.writeObject(cc);
        oos.close();
    }
}
