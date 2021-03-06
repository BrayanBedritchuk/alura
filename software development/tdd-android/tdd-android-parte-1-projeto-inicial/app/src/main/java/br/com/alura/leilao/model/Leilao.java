package br.com.alura.leilao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leilao implements Serializable {

    private final String descricao;
    private final List<Lance> lances;
    private double maiorLance = Double.NEGATIVE_INFINITY;
    private double menorLance = Double.POSITIVE_INFINITY;

    public Leilao(String descricao) {
        this.descricao = descricao;
        this.lances = new ArrayList<>();
    }

    public void proporLance(Lance lance) {
        lances.add(lance);
        Collections.sort(lances);
        double valorLance = lance.getValor();

        if (valorLance > maiorLance) {
            maiorLance = valorLance;
        }

        if (valorLance < menorLance) {
            menorLance = valorLance;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public double getMaiorLance() {
        return maiorLance;
    }

    public double getMenorLance() {
        return menorLance;
    }

    public List<Lance> getTresMaioresLances() {
        int tamanho = 3;
        if (lances.size() < 3) {
            tamanho = lances.size();
        }
        return lances.subList(0, tamanho);
    }

}
