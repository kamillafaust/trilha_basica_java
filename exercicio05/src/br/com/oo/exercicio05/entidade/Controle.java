package br.com.oo.exercicio05.entidade;

import java.util.Scanner;

public class Controle {

    Scanner input = new Scanner(System.in);

    public String lerString() {
        return this.input.nextLine();
    }

    public int lerInteger() {
        return Integer.parseInt(this.input.nextLine());
    }
}
