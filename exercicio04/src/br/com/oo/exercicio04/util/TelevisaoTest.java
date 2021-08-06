package br.com.oo.exercicio04.util;

import br.com.oo.exercicio04.entidade.Televisao;
import br.com.oo.exercicio04.modelo.ControleRemoto;
import org.junit.Test;


import javax.swing.*;

public class TelevisaoTest {

    Televisao tv = new Televisao(45, 60);
    ControleRemoto controle = new ControleRemoto();

    //@Test
    public void testAumentarVolumeDaTv() {
        String mensagem = controle.aumentarVolume(tv);
        System.out.println(mensagem);
    }

    //@Test
    public void testDiminuirVolumeDaTv() {
        String mensagem = controle.diminuirVolume(tv);
        System.out.println(mensagem);
    }

    //@Test
    public void testAumentarCanalTv() {
        String mensagem = controle.aumentarCanal(tv);
        System.out.println(mensagem);
    }

    //@Test
    public void testDiminuirCanalTv() {
        String mensagem = controle.diminuirCanal(tv);
        System.out.println(mensagem);
    }

    //@Test
    public void testConsultarCanalEVolumeTv() {
        String mensagem = controle.consultarSomECanalTv(tv);
        System.out.println(mensagem);
    }

    //@Test
    public void testTrocarCanalDeTv() {
        int canal = Integer.parseInt(JOptionPane.showInputDialog("Digite o canal que deseja assistir: "));
        String mensagem = controle.trocarCanal(tv, canal);
        System.out.println(mensagem);
    }
}
