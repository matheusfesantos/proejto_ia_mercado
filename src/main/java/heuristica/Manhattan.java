package heuristica;

import model.Posicao;

public class Manhattan implements Heuristica {

    @Override
    public int calcular(Posicao atual, Posicao objetivo) {
        return Math.abs(atual.linha - objetivo.linha)
                + Math.abs(atual.coluna - objetivo.coluna);
    }
}