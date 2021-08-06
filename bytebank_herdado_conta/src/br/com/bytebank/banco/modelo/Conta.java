package br.com.bytebank.banco.modelo;

/**
 * Classe representa a moljdura de uma conta
 *
 */

public abstract class Conta extends Object implements Comparable<Conta>{

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total; //static para ser um atributo da classe, ele é compartilhado


    public Conta(int agencia, int numero) {
        //modelo.Conta.total++
        total++;
        this.agencia = agencia;
        this.numero = numero;
     // this.saldo = 100;
        System.out.println("modelo.Conta " + this.numero + " aberta com sucesso!");
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
    public abstract void deposita(double valor);

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta contadestino) {
        if (this.saca(valor)){
            contadestino.deposita(valor);
            return true;
        }
        return false;
    }

    public double pegaSaldo(){
        return this.saldo;
    }

    public boolean equals(Object ref){

        Conta outraConta = (Conta) ref;

        if(this.agencia != outraConta.agencia){
            return false;
        }
        if(this.numero != outraConta.numero){
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Conta outraConta) {
        return Double.compare(this.saldo, outraConta.saldo);
    }

    @Override
    public String toString(){
        return "Numero: " + this.numero + ", Agência ";
    }
}
