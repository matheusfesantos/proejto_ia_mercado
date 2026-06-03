package ambiente;

public class MapaSupermercado {

    public static final int LIVRE = 0;
    public static final int OBSTACULO = 1;

    public static final int[][] MAPA = {
            {0,0,0,1,0,0,0,0,0},
            {1,1,0,1,0,1,1,1,0},
            {0,0,0,0,0,0,0,1,0},
            {0,1,1,1,1,1,0,1,0},
            {0,0,0,0,0,1,0,0,0},
            {0,1,1,1,0,0,0,1,0}
    };

    public static boolean podeMover(int l, int c) {
        return l >= 0 &&
                l < MAPA.length &&
                c >= 0 &&
                c < MAPA[0].length &&
                MAPA[l][c] == LIVRE;
    }
}