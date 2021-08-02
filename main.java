public class Main {
    public static void main(String[] args) {

        int y2=12;
        int x2=12;
        boolean t[][] = new boolean[y2][x2];
        boolean tmp[][] = new boolean[y2+2][x2+2];

        t[1][1] = true;
        t[1][2] = true;
        t[1][3] = true;

        for(int i=0; i<40; i++) {
            for (int y = 0; y <= 11; y++) {
                for (int x = 0; x <= 11; x++) {
                    if (t[y][x] == true) {
                        System.out.print("X");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
            for (int y = 0; y <= 11; y++) {
                for (int x = 0; x <= 11; x++) {
                    tmp[y + 1][x + 1] = t[y][x];
                }

            }

            for (int y = 1; y <= 11 + 1; y++) {
                for (int x = 1; x <= 11 + 1; x++) {
                    int nb_voisin_vivant = 0;
                    if (tmp[y - 1][x - 1] == true) nb_voisin_vivant++;
                    if (tmp[y - 1][x - 0] == true) nb_voisin_vivant++;
                    if (tmp[y - 1][x + 1] == true) nb_voisin_vivant++;
                    if (tmp[y - 0][x - 1] == true) nb_voisin_vivant++;
                    if (tmp[y - 0][x + 1] == true) nb_voisin_vivant++;
                    if (tmp[y + 1][x - 1] == true) nb_voisin_vivant++;
                    if (tmp[y + 1][x - 0] == true) nb_voisin_vivant++;
                    if (tmp[y + 1][x + 1] == true) nb_voisin_vivant++;
                   // System.out.println("[" + x + "][" + y + "] : " + nb_voisin_vivant);
                    if (nb_voisin_vivant == 3) t[y - 1][x - 1] = true;
                    if (nb_voisin_vivant < 2) t[y - 1][x - 1] = false;
                    if (nb_voisin_vivant >= 4) t[y - 1][x - 1] = false;

                }
            }
        }
    }
}
