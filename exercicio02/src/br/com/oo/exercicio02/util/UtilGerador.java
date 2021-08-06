package br.com.oo.exercicio02.util;

public class UtilGerador {

    public String gerarNome() {
        String nome;
        int indice;
        String[] nomes = {"João", "Maria", "Beatriz", "Antônio",
                "Jeferson", "Silvio", "Tatiani", "Analu", "Joana", "Kamilla", "Kelly",
                "Vinícius", "Marcos", "Pedro", "Rodrigo", "Júlia", "Cintia", "Marta", "Micheli",
                "Anderson", "Sergio", "Gabriel", "Sandra", "Ana", "Juliana", "Marcelo", "Vicente",
                "Luiza", "Nayara", "Lucas", "Matheus", "Vitor", "Gustavo", "Mauricio", "Levi", "Nathalia"};
        indice = (int) (Math.random() * nomes.length);
        nome = nomes[indice];
        nome = nome + " " + gerarSobreNome();
        return nome;
    }

    private String gerarSobreNome() {
        String sobrenome;
        int indice;
        String[] nomes = {"Silva", "Motto", "Ribeiro", "May",
                "Junior", "Flores", "Souza", "Aurelio", "Pereira", "Oliveira", "Araujo",
                "Matos", "Barbosa", "Nascimento", "Coe", "Garcia", "Lopez", "Peres", "Pires",
                "Martinez", "Rodrigues", "Neto", "Machado", "Schurhaus", "Faust", "Vill",
                "Schmidt", "Weiss", "Medeiros", "Rosa", "Ferreira", "Quintino"};
        indice = (int) (Math.random() * nomes.length);
        sobrenome = nomes[indice];
        return sobrenome;
    }

    public int gerarIdade(int qtd) {
        int numero= 0;
        for (int i = 0; i < qtd; i++) {
            numero += (int) (Math.random() * 10);
        }
        return numero;
    }

    public float gerarAltura() {
        float altura;
        int indice;
        float[] alturas = {1.56f, 1.75f, 1.87f, 1.58f, 1.74f, 1.92f, 1.64f, 1.66f, 1.52f};
        indice = (int) (Math.random() * alturas.length);
        altura = alturas[indice];
        return altura;
    }


}
