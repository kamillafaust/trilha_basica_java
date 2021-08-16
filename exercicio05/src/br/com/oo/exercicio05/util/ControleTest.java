package br.com.oo.exercicio05.util;

import br.com.oo.exercicio05.entidade.Caminhao;
import br.com.oo.exercicio05.entidade.Controle;
import br.com.oo.exercicio05.entidade.Pluviometro;
import br.com.oo.exercicio05.modelo.CaminhaoControle;
import java.util.ArrayList;
import java.util.List;

public class ControleTest {

    public static void main(String[] args) {

        CaminhaoControle caminhaoControle = new CaminhaoControle();
        Controle controle = new Controle();
        List<Caminhao> listaTotal = new ArrayList<>();

        String verifica;
        do {
            Caminhao caminhao = new Caminhao();
            Pluviometro pluviometro = new Pluviometro();
            System.out.print("Digite 'Alfa' para o caminhão Alfa, 'Beta' para o caminhão Beta: ");
            String tipoCaminhao = controle.lerString();
            caminhao.setTipoCaminhao(tipoCaminhao);

            System.out.print("Qual a quantidade de pluviometro que deseja carregar: ");
            int quantidade = controle.lerInteger();
            pluviometro.setQuantidade(quantidade);

            List<String> listaAdd = new ArrayList<>();
            System.out.print("Escolha os Pluviometros: \n 1- Convencionais \n 2- Semiautomáticos \n 3- Automáticos \n");
            for (int i = 0; i < quantidade; i++) {
                String recebeLista = caminhaoControle.listaPluviometros();
                listaAdd.add(recebeLista);
            }
            pluviometro.setListaPluviometros(listaAdd);
            caminhao.setPluviometro(pluviometro);
            listaTotal.add(caminhao);

            System.out.print("Digite 1 para adicionar outro caminhão ou FIM para encerrar: ");
            String opcao = controle.lerString();
            System.out.println("");
            verifica = opcao;

        } while (!verifica.equalsIgnoreCase("Fim"));

        System.out.println("Fim da execução. \n");
        System.out.println("O caminhão mais apto será: ");

        Caminhao caminhaoApto = caminhaoControle.caminhaoMaisApto(listaTotal);
        System.out.println("Caminhão: " + caminhaoApto.getTipoCaminhao());
        System.out.println("Com os pluviômetros: " + caminhaoApto.getPluviometro().getListaPluviometros());
    }
}
