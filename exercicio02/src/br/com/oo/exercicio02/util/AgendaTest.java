package br.com.oo.exercicio02.util;

import br.com.oo.exercicio02.modelo.Metodo;
import br.com.oo.exercicio02.entidade.Pessoa;

import javax.swing.*;
import java.util.List;

public class AgendaTest {

    Metodo agenda = new Metodo();
    Pessoa pessoa;

    //@Test
    public void testArmazenaPessoa() {
        List<Pessoa> pessoas = agenda.armazenaPessoa(); //nova lista para receber a lista que vem da classe AgendaMetodo
        System.out.println("Contatos salvos com sucesso!");
        System.out.println("Existem " + pessoas.size() + " contatos na agenda.");
    }

    //@Test
    public void testBuscarNomeEPosicao() {
        List<Pessoa> pessoas = agenda.armazenaPessoa();
        mostrarListaPessoas(pessoas);
        String nome = JOptionPane.showInputDialog("Digite um nome para pesquisar na agenda: ");
        List<Pessoa> contatosPesquisado = agenda.pesquisarPorNome(pessoas, nome);
        System.out.println("");
        System.out.println("SEU CONTATO PESQUISADO NA LISTA FOI: \n");
        mostrarListaPessoasPesquisadas(contatosPesquisado);
    }

    //@Test
    public void testBuscaPessoaIndex() {
        List<Pessoa> pessoas = agenda.armazenaPessoa();
        mostrarListaPessoas(pessoas);
        int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da posição do contato na lista para " +
                "imprimir seus dados: "));
        List<Pessoa> contatosPesquisado = agenda.pesquisarPorIndex(pessoas, posicao);
        System.out.println("");
        System.out.println("SEU CONTATO PESQUISADO NA LISTA FOI: \n");
        mostrarListaPessoas(contatosPesquisado);
    }

    //@Test
    public void testImprimeAgenda() {
        List<Pessoa> pessoas = agenda.armazenaPessoa();
        System.out.println("Listando todos os contatos da agenda e seus dados: \n");
        mostrarListaPessoas(pessoas);
    }

    //@Test
    public void testRemovePessoa() {
        List<Pessoa> pessoas = agenda.armazenaPessoa();
        mostrarListaPessoas(pessoas);
        String nome = JOptionPane.showInputDialog("Digite o nome completo do contato que deseja excluir: ");
        List<Pessoa> contatos = agenda.removerPessoa(pessoas, nome);
        System.out.println("Contato removido com sucesso!");
        System.out.println("Atualização da agenda: \n");
        mostrarListaPessoas(contatos);
    }

    private static void mostrarListaPessoas(List<Pessoa> pessoas) {

       pessoas.forEach(pessoa -> {
           System.out.println("Nome: " + pessoa.getNome());
           System.out.println("Idade: " + pessoa.getIdade());
           System.out.println("Altura: " + pessoa.getAltura());
           pessoa.setIndice(pessoas.indexOf(pessoa));
           System.out.println("");
       });
    }

    private static void mostrarListaPessoasPesquisadas(List<Pessoa> pessoas) {

        pessoas.forEach(pessoa -> {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Altura: " + pessoa.getAltura());
            System.out.println("Posição na lista: " + pessoa.getIndice());
            System.out.println("");
        });
    }
}






