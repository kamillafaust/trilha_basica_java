package br.com.oo.exercicio04.modelo;

import br.com.oo.exercicio04.entidade.Televisao;

public class ControleRemoto {

    public String aumentarVolume(Televisao tv){
        if(tv.getVolume() < 100){
            tv.setVolume(tv.getVolume() + 1);
            return "O volume da televisão aumentou para " + tv.getVolume() + ".";
        }
         return "O volume da televisão está no máximo.";
    }

    public String diminuirVolume(Televisao tv){
        if(tv.getVolume() != 0){
            tv.setVolume(tv.getVolume() - 1);
            return "O volume da televisão diminuiu para " +  tv.getVolume() + ".";
        }
        return "A televisão está no volume mínimo.";
    }

    public String aumentarCanal(Televisao tv){
        if(tv.getCanal() < 88){
            tv.setCanal(tv.getCanal() + 1);
            return "O canal da televisão aumentou para " +  tv.getCanal() + ".";
        }
        return "A televisão está em seu último canal";
    }

    public String diminuirCanal(Televisao tv){
        if(tv.getCanal() != 0){
            tv.setCanal(tv.getCanal() - 1);
            return "O canal da televisão diminuiu para " +  tv.getCanal() + ".";
        }
        return "A televisão está no seu canal mímino";
    }

    public String trocarCanal(Televisao tv, int canal){
        if(tv.getCanal() > 0 || tv.getCanal() < 80){
            tv.setCanal(canal);
            return "A televisão mudou para o canal " + tv.getCanal() + ".";
        }
        return "Canal inexistente";
    }

    public String consultarSomECanalTv(Televisao tv){
        int canal = tv.getCanal();
        int volume = tv.getVolume();
        return "A televisão está no canal " + canal + " e o volume em " + volume + ".";
    }
}
