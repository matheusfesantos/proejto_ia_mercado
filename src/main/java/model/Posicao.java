package model;
import java.util.Objects;

public class Posicao {
    public int linha;
    public int coluna;

    public Posicao(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Posicao)) return false;
        Posicao p = (Posicao) o;
        return linha == p.linha && coluna == p.coluna;
    }

    @Override
    public int hashCode() {
        return Objects.hash(linha, coluna);
    }
}