package heuristica;

import model.Posicao;

public class HeuristicaNaoAdmissivel implements Heuristica {

    @Override
    public int calcular(Posicao atual, Posicao objetivo) {
        int manhattan = Math.abs(atual.linha - objetivo.linha)
                + Math.abs(atual.coluna - objetivo.coluna);

        return manhattan * 2; // superestima
    }
}