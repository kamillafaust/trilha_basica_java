public class TestaCondicional2 {

    public static void main(String[] args) {
        System.out.println("Testando Condicionais");

        int idade = 16;
        int quantidadePessoas = 3;
        boolean acompanhado = quantidadePessoas >= 2;

        if (idade >= 18 && acompanhado) {

            System.out.println("Seja bem vindo/a!");
        } else {
            System.out.println("Infelizmente você não pode entrar.");
        }
    }
}
