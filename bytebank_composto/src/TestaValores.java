public class TestaValores {

    public static void main(String[] args) {
        Conta conta = new Conta(563,765);
        Cliente cliente = new Cliente();
        cliente.setNome("Kamilla");
        conta.setTitular(cliente);
        System.out.println(conta.getTitular().getNome());

        Conta conta2 = new Conta(765,876);
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Lilian");
        conta.setTitular(cliente2);
        System.out.println(conta.getTitular().getNome());

        System.out.println("");
        System.out.println("Total de contas abertas: " + Conta.getTotal());
    }
}
