package ambiente;

public class RenderizarMapa {

    public static void imprimirMapa() {

        int[][] mapa = ambiente.MapaSupermercado.MAPA;

        System.out.println("🗺️ MAPA DO SUPERMERCADO:");
        System.out.println("(0 = livre | 1 = obstáculo)");
        System.out.println("(S = Posição inicial do carrinho | G = Objetivo)\n");

        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[0].length; j++) {

                if (i == 1 && j == 0) {
                    System.out.print(" S "); // Start
                } else if (i == 5 && j == 8) {
                    System.out.print(" G "); // Goal
                } else if (mapa[i][j] == 1) {
                    System.out.print(" # ");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }

        System.out.println();
    }
}
