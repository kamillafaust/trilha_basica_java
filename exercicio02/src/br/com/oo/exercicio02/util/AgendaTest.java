package br.com.oo.exercicio02.util;

import br.com.oo.exercicio02.modelo.AgendaMetodo;
import br.com.oo.exercicio02.entidade.PessoaEntidade;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.util.Collections;
import java.util.List;

public class AgendaTest {

    AgendaMetodo agenda = new AgendaMetodo();
    PessoaEntidade pessoa;

    //@Test
    public void testArmazenaPessoa() {
        List<PessoaEntidade> pessoas = agenda.armazenaPessoa(); //nova lista para receber a lista que vem da classe Agenda
        System.out.println("Contatos salvos com sucesso!");
        System.out.println("Existem " + pessoas.size() + " contatos na agenda.");
    }

    //@Test
    public void testBuscaPessoaNomeEPosicaoNaLista() {
        List<PessoaEntidade> pessoas = agenda.armazenaPessoa();
        mostrarListaPessoas(pessoas);
        String nome = JOptionPane.showInputDialog("Digite um nome para pesquisar na agenda: ");
        List<PessoaEntidade> contatosPesquisado = agenda.pesquisarPorNome(pessoas, nome);
        System.out.println("");
        System.out.println("SEU CONTATO PESQUISADO NA LISTA FOI: ");
        mostrarListaPessoasPesquisadas(contatosPesquisado);
    }

    //@Test
    public void testBuscaPessoaIndex() {
        List<PessoaEntidade> pessoas = agenda.armazenaPessoa();
        mostrarListaPessoas(pessoas);
        int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da posição do contato na lista para " +
                "imprimir seus dados: "));
        List<PessoaEntidade> contatosPesquisado = agenda.pesquisarPorIndex(pessoas, posicao);
        System.out.println("");
        System.out.println("SEU CONTATO PESQUISADO NA LISTA FOI: ");
        mostrarListaPessoas(contatosPesquisado);
    }

    //@Test
    public void testImprimeAgenda() {
        List<PessoaEntidade> pessoas = agenda.armazenaPessoa();
        System.out.println("Listando todos os contatos da agenda e seus dados: ");
        mostrarListaPessoas(pessoas);
    }

    //@Test
    public void testRemovePessoa() {
        List<PessoaEntidade> pessoas = agenda.armazenaPessoa();
        mostrarListaPessoas(pessoas);
        String nome = JOptionPane.showInputDialog("Digite o nome completo do contato que deseja excluir: ");
        List<PessoaEntidade> contatos = agenda.removerPessoa(pessoas, nome);
        System.out.println("Contato removido com sucesso!");
        System.out.println("");
        mostrarListaPessoas(contatos);
    }

    private static void mostrarListaPessoas(List<PessoaEntidade> pessoas) {
        for (PessoaEntidade pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Altura: " + pessoa.getAltura());
            pessoa.setIndice(pessoas.indexOf(pessoa));
            //  System.out.println("indice: "+ pessoa.getIndice());
            System.out.println("");
        }
    }

    private static void mostrarListaPessoasPesquisadas(List<PessoaEntidade> pessoas) {
        for (PessoaEntidade pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Altura: " + pessoa.getAltura());
            System.out.println("Posição na lista: " + pessoa.getIndice());
            System.out.println("");
        }
    }
}






