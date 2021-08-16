package br.com.oo.exercicio02.modelo;


import br.com.oo.exercicio02.entidade.Pessoa;
import br.com.oo.exercicio02.util.UtilGerador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Metodo {

    UtilGerador util = new UtilGerador();

    public List<Pessoa> armazenaPessoa() {
        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa pessoa;
        for (int i = 0; i < 10; i++) { //agenda com 10 contatos
            pessoa = new Pessoa(util.gerarNome(), util.gerarIdade(2), util.gerarAltura());
            pessoas.add(pessoa);
            Collections.sort(pessoas);
        }
        return pessoas;
    }

    public List<Pessoa> pesquisarPorNome(List<Pessoa> pessoas, String nome) {
        List<Pessoa> contatosPesquisado = new ArrayList(); // foi criada uma lista nova para retornar os nomes pesquisados.

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().contains(nome)) {
                pessoa.setIndice(pessoas.indexOf(pessoa) + 1);
                contatosPesquisado.add(pessoa);
            }
        }
        return contatosPesquisado;
    }

    public List<Pessoa> pesquisarPorIndex(List<Pessoa> pessoas, int index){
        List<Pessoa> contatoPesquisadoIndex = new ArrayList<>();

        for (Pessoa pessoa: pessoas) {
            pessoa.setIndice(pessoas.indexOf(pessoa) + 1);
            if(pessoa.getIndice() == index){
                contatoPesquisadoIndex.add(pessoa);
            }
        }
        return contatoPesquisadoIndex;
    }

    public List<Pessoa> removerPessoa(List<Pessoa> pessoas, String nome){
        List<Pessoa> contatosAtualizados = new ArrayList<>();

        for (Pessoa pessoa: pessoas) {
            if(pessoa.getNome().contains(nome)){
                pessoas.remove(pessoa);
                contatosAtualizados = pessoas;
                break;
            }
        }
        return contatosAtualizados;
    }
}












