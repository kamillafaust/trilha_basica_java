package br.com.oo.exercicio02.entidade;

public class PessoaEntidade implements Comparable<PessoaEntidade>{

    private String nome;
    private int idade;
    private float altura;
    private int indice;

    public PessoaEntidade(){

    }
    public PessoaEntidade(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    @Override
    public int compareTo(PessoaEntidade outroNome) {
        return this.nome.compareTo(outroNome.getNome());
    }
}
