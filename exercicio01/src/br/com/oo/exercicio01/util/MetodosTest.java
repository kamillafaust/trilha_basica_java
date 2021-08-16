package br.com.oo.exercicio01.util;

import br.com.oo.exercicio01.entidade.Pessoa;
import br.com.oo.exercicio01.modelo.Metodos;
import org.junit.Test;

import javax.swing.*;

public class MetodosTest {

    Metodos metodo = new Metodos();

    //@Test
    public void testImprimeDadosDaPessoa() {
        Pessoa pessoa = new Pessoa();
        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        String altura = JOptionPane.showInputDialog("Digite a sua altura: ");
        String dataNascimento = JOptionPane.showInputDialog("Digite sua data de nascimento: ");

        metodo.retornaDadosPessoa(nome, altura, dataNascimento);
    }

    //@Test
    public void testImprimeIdade(){
        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do seu nascimento: "));
        metodo.calcularIdade(ano, nome);
    }


}
