public class TestaBanco {

    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.setNome("Paulo Silveira");
        paulo.setCpf("222.222.222-22");
        paulo.setProfissao("Programador");
        System.out.println(paulo.getNome());

        Conta contadoPaulo = new Conta(123, 3455);
        contadoPaulo.deposita(100);


    }
}
