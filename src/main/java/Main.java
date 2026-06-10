import ambiente.RenderizarMapa;
import busca.AEstrela;
import heuristica.HeuristicaNaoAdmissivel;
import heuristica.Manhattan;
import model.Posicao;

import static ambiente.RenderizarMapa.imprimirMapa;

public class Main {

    public static void main(String[] args) {

        Posicao inicio = new Posicao(1, 0);
        Posicao objetivo = new Posicao(5, 8);

        System.out.println("\n=======================================");
        System.out.println("🛒 CARRINHO DE SUPERMERCADO - A* SEARCH");
        System.out.println("=======================================\n");

        System.out.println("=======================================");
        System.out.println(" RENDERIZAÇÃO DO MAPA \n");
        imprimirMapa();
        System.out.println("=======================================\n");

        System.out.println("📍 Posição inicial do carrinho: (5,0)");
        System.out.println("🎯 Produto desejado está em: (5,8)");
        System.out.println("🧠 O carrinho vai escolher o melhor caminho automaticamente\n");

        System.out.println("=======================================");
        System.out.println("🟢 EXECUÇÃO 1: HEURÍSTICA ADMISSÍVEL");
        System.out.println("➡️ O carrinho usa a distância real estimada (Manhattan)");
        System.out.println("➡️ Ele NÃO superestima o custo");
        System.out.println("=======================================\n");

        AEstrela.executar(inicio, objetivo, new Manhattan());

        System.out.println("\n=======================================");
        System.out.println("🔴 EXECUÇÃO 2: HEURÍSTICA NÃO ADMISSÍVEL");
        System.out.println("➡️ O carrinho SUPERESTIMA a distância");
        System.out.println("➡️ Ele pode priorizar caminhos diferentes");
        System.out.println("=======================================\n");

        AEstrela.executar(inicio, objetivo, new HeuristicaNaoAdmissivel());

        System.out.println("\n=======================================");
        System.out.println("🏁 FIM DA SIMULAÇÃO");
        System.out.println("📊 Agora compare os caminhos e custos");
        System.out.println("=======================================");
    }
}