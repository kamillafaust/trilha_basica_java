package br.com.oo.exercicio01.modelo;

import br.com.oo.exercicio01.entidade.Pessoa;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Metodos {

    public void retornaDadosPessoa(String nome, String altura, String dataNascimento) {
        System.out.print("Ola, " + nome + "! Você nasceu em " + dataNascimento + " e hoje possui " + altura
                + " de altura.");
    }

    public void calcularIdade (int ano, String nome) {
        SimpleDateFormat formatarData = new SimpleDateFormat("yyyy");
        int anoAtual = Integer.parseInt(formatarData.format(new Date()));
        int idade = anoAtual - ano;
        System.out.println(nome + ", você tem " + idade + " anos.");
    }
}
