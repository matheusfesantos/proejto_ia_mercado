package heuristica;

import model.Posicao;

public interface Heuristica {
    int calcular(Posicao atual, Posicao objetivo);
}