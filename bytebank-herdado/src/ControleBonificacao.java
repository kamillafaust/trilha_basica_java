public class ControleBonificacao {

    private double soma;

    public void registra(Funcionario f){
        double bonificacao = f.getBonificacao();
        this.soma = this.soma + bonificacao;
    }

    public double somaTotalBonificacao(){
        return soma;
    }
}
