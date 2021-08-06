package br.com.oo.exercicio02.modelo;


import br.com.oo.exercicio02.entidade.PessoaEntidade;
import br.com.oo.exercicio02.util.UtilGerador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AgendaMetodo {

    UtilGerador util = new UtilGerador();

    public List<PessoaEntidade> armazenaPessoa() {

        List<PessoaEntidade> pessoas = new ArrayList<>();
        PessoaEntidade pessoa;
        for (int i = 0; i < 10; i++) {
            pessoa = new PessoaEntidade(util.gerarNome(), util.gerarIdade(2), util.gerarAltura());
            pessoas.add(pessoa);
            Collections.sort(pessoas);
        }
        return pessoas;
    }

    public List<PessoaEntidade> pesquisarPorNome(List<PessoaEntidade> pessoas, String nome) {
        List<PessoaEntidade> contatosPesquisado = new ArrayList(); // foi criado uma lista nova para retornar os nomes pesquisados.

        for (PessoaEntidade pessoa : pessoas) {
            if (pessoa.getNome().contains(nome)) {
                pessoa.setIndice(pessoas.indexOf(pessoa) + 1);
                contatosPesquisado.add(pessoa);
            }
        }
        return contatosPesquisado;
    }

    public List<PessoaEntidade> pesquisarPorIndex(List<PessoaEntidade> pessoas, int index){
        List<PessoaEntidade> contatoPesquisadoIndex = new ArrayList<>();

        for (PessoaEntidade pessoa: pessoas) {
            pessoa.setIndice(pessoas.indexOf(pessoa) + 1);
            if(pessoa.getIndice() == index){
                contatoPesquisadoIndex.add(pessoa);
            }
        }
        return contatoPesquisadoIndex;
    }

    public List<PessoaEntidade> removerPessoa(List<PessoaEntidade> pessoas, String nome){
        List<PessoaEntidade> contatosAtualizados = new ArrayList<>();

        for (PessoaEntidade pessoa: pessoas) {
            if(pessoa.getNome().contains(nome)){
                pessoas.remove(pessoa);
                contatosAtualizados = pessoas;
                break;
            }
        }
        return contatosAtualizados;
    }


}












