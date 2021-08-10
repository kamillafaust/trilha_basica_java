package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

    public static void main(String[] args) throws Exception, ClassNotFoundException {

//        Cliente cliente = new Cliente();
//        cliente.setNome("Kamilla");
//        cliente.setProfissao("Dev");
//        cliente.setCpf("44523232334");
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Users/Kamilla/IdeaProjects/trilha_java/java_io/objeto.bin"));
//        oos.writeObject(cliente);
//        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Users/Kamilla/IdeaProjects/trilha_java/java_io/objeto.bin"));
        Cliente cliente = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente.getCpf());
    }
}
