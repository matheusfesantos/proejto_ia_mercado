package model;

public class No implements Comparable<No> {

    public Posicao posicao;
    public int g;
    public int h;
    public int f;
    public No pai;

    public No(Posicao posicao, int g, int h, No pai) {
        this.posicao = posicao;
        this.g = g;
        this.h = h;
        this.f = g + h;
        this.pai = pai;
    }

    @Override
    public int compareTo(No outro) {
        return Integer.compare(this.f, outro.f);
    }
}