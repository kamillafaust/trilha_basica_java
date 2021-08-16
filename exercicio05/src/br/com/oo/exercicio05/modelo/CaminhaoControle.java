package br.com.oo.exercicio05.modelo;

import br.com.oo.exercicio05.entidade.Caminhao;
import br.com.oo.exercicio05.entidade.Controle;
import java.util.List;

public class CaminhaoControle extends Controle {

    Controle controle = new Controle();

    public String listaPluviometros() {
        System.out.print("Escolha o tipo do pluviômetro: ");
        String tipoEscolhido = super.lerString();
        return tipoEscolhido;
    }

    public Caminhao caminhaoMaisApto(List<Caminhao> caminhoes) {
        Caminhao retornaCaminhaoApto = null;

        int maiorCapacidade = 0;

        for (Caminhao caminhao : caminhoes) {
            if (caminhao.getPluviometro().getQuantidade() > maiorCapacidade) {
                maiorCapacidade = caminhao.getPluviometro().getQuantidade();
                retornaCaminhaoApto = caminhao;
            }
        }
        return retornaCaminhaoApto;
    }

}
