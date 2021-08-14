/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiobrazek3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.AdjustmentEvent;
import java.awt.image.MemoryImageSource;
import javax.swing.JFrame;
import javax.swing.JScrollBar;

/**
 *
 * @author kuba
 */
public class Program extends JFrame {
    public static final int ROZSAH = 256;
    Platno p1;
    Image img;
    int[] pixel = new int[ROZSAH * ROZSAH];
    JScrollBar zelenaSB;

    public Program() {
        p1 = new Platno();
        this.add(p1, BorderLayout.CENTER);
        zelenaSB = new JScrollBar(JScrollBar.HORIZONTAL,
                ROZSAH/2, 1, 0, ROZSAH);
        zelenaSB.setBackground(new Color(0, ROZSAH/2, 0));
        img = pripravObrazek(ROZSAH/2);
        p1.vykresliObrazek(img);
        zelenaSB.addAdjustmentListener((AdjustmentEvent e) -> {
            int z = zelenaSB.getValue();
            img = pripravObrazek(z);
            p1.vykresliObrazek(img);
            zelenaSB.setBackground(new Color(0, z, 0));
        });
        this.add(zelenaSB, BorderLayout.SOUTH);
        this.pack();
    }
    Image pripravObrazek(int zelena) {
        int index = 0;
        for(int cervena = 0; cervena < ROZSAH; cervena++) {
            for(int modra = 0; modra < ROZSAH; modra++) {
                pixel[index++] = (255<<24) + (cervena << 16)
                        + (zelena << 8) + modra;
            }
        }
        MemoryImageSource mis = new MemoryImageSource(ROZSAH,
                ROZSAH, pixel, 0, ROZSAH);
        return createImage(mis);
    }
}