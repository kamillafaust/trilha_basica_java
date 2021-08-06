public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total; //static para ser um atributo da classe, ele é compartilhado

    public Conta(int agencia, int numero) {
        //Conta.total++
        total++;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100;
        System.out.println("Conta " + this.numero + " aberta com sucesso!");
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return total;
    }

    //métodos da classe
    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta contadestino) {
        if (this.saldo >= valor) {
            saca(valor);
            contadestino.deposita(valor);
            return true;
        }
        return false;
    }

    public double pegaSaldo(){
        return this.saldo;
    }
}
