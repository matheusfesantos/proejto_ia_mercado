package busca;

import ambiente.MapaSupermercado;
import heuristica.Heuristica;
import model.No;
import model.Posicao;

import java.util.*;

public class AEstrela {

    private static final int[][] MOVIMENTOS = {
            {-1,0},{1,0},{0,-1},{0,1}
    };

    public static void executar(Posicao inicio,
                                Posicao objetivo,
                                Heuristica heuristica) {

        PriorityQueue<No> aberto = new PriorityQueue<>();
        Set<Posicao> fechado = new HashSet<>();

        No raiz = new No(
                inicio,
                0,
                heuristica.calcular(inicio, objetivo),
                null
        );

        aberto.add(raiz);

        while (!aberto.isEmpty()) {

            No atual = aberto.poll();

            if (fechado.contains(atual.posicao))
                continue;

            fechado.add(atual.posicao);

            System.out.println("Expandindo: (" +
                    atual.posicao.linha + "," +
                    atual.posicao.coluna + ") f=" + atual.f);

            if (atual.posicao.equals(objetivo)) {
                imprimirCaminho(atual, fechado);
                return;
            }

            for (int[] m : MOVIMENTOS) {

                int nl = atual.posicao.linha + m[0];
                int nc = atual.posicao.coluna + m[1];

                if (!MapaSupermercado.podeMover(nl, nc))
                    continue;

                Posicao vizinho = new Posicao(nl, nc);

                if (fechado.contains(vizinho))
                    continue;

                int g = atual.g + 1;
                int h = heuristica.calcular(vizinho, objetivo);

                aberto.add(new No(vizinho, g, h, atual));
            }
        }

        System.out.println("Sem solução.");
    }

    private static void imprimirCaminho(No objetivo, Set<Posicao> fechado) {

        List<No> caminho = new ArrayList<>();

        No atual = objetivo;
        while (atual != null) {
            caminho.add(atual);
            atual = atual.pai;
        }

        Collections.reverse(caminho);

        System.out.println("\nCAMINHO:");
        for (No n : caminho) {
            System.out.print("(" +
                    n.posicao.linha + "," +
                    n.posicao.coluna + ") ");
        }

        System.out.println("\nCusto: " + objetivo.g);

        System.out.println("\nClosed:");
        System.out.println(fechado);
    }
}