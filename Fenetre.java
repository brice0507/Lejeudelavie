import javax.swing.*;
import java.awt.*;

public class Fenetre extends  JFrame{
    int y2=12;
    int x2=12;
    boolean t[][] = new boolean[y2][x2];
    JLabel tableau[][] = new
    JLabel[t.length][t[0].length];
    public Fenetre() {
        super.setSize((tableau[0].length * (10 + 7)), (tableau.length * (10 + 5)) + 50);
        Container contenu = super.getContentPane();
        contenu.setLayout(new FlowLayout());
        t[1][1] = true;
        t[1][2] = true;
        t[1][3] = true;
        for (int y = 0; y < tableau.length; y++) {
            for (int x = 0; x < tableau[0].length; x++) {
                add(tableau[y][x] = new JLabel(getImage(t[y][x])));
            }
        }

        super.setVisible(true);
        new Fenetre().setVisible(true);
        while (true) {
            //regle();
            //refresh();
            new Attend(2500);


        }
    }
    public ImageIcon getImage(boolean box){
        if(!box){
            return new ImageIcon("./image/blanc.png");
        }else {
            return new ImageIcon("./image/noir.png");
        }
        }

    public static void main(String[] args){

    }

}
