public class TestaSacaNegativo {

    public static void main(String[] args) {
        Conta conta = new Conta(654, 245);
        conta.deposita(100);
        System.out.println(conta.saca(101));

        conta.saca(101);
        System.out.println(conta.pegaSaldo());

    }
}
