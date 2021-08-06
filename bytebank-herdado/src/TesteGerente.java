public class TesteGerente {

    public static void main(String[] args) {

        Autenticavel referencia = new Cliente();

        Gerente gerenteUm = new Gerente();
        gerenteUm.setNome("Marco");
        gerenteUm.setCpf("52324342-23");
        gerenteUm.setSalario(5000.0);
        gerenteUm.setSenha(12345);

        System.out.println(gerenteUm.getNome());
        System.out.println(gerenteUm.getSalario());

        gerenteUm.setSenha(12345);
        boolean autenticou = gerenteUm.autentica(12345);
        System.out.println(autenticou);

        System.out.println(gerenteUm.getBonificacao());
    }
}
