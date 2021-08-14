/*
MIT License

Copyright (c) 2019 Jakub Holeček

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
*/
package my.cookbook;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author kuba
 */
public class RecipeWindowSet extends javax.swing.JFrame {
    private final Recept recept = CookBookUI.CB.recept; 
    private final Recept novyRecept = new Recept();
    private boolean setEditable = false;
    //Instance potřebné pro obrázky
    private final Obrazky obr = new Obrazky();
    private final Toolkit t = Toolkit.getDefaultToolkit();
    private ImageIcon icon;
    private final JFileChooser FC = new JFileChooser();
    private String imgCesta = "";
    private Image img;

    /**
     * Creates new form RecipeWindow
     * @throws java.io.IOException
     * @throws java.io.FileNotFoundException
     * @throws java.lang.ClassNotFoundException
     */
    public RecipeWindowSet() throws IOException, FileNotFoundException, ClassNotFoundException {
        initComponents();
        initRecept();
        this.pack();
    }
    
    private void initRecept () {        
        nazevReceptuTF.setText(recept.getNazev());
        popisReceptuTA.setText(recept.getPopis());
        nazevIngTF1.setText(recept.getIngredience(0));mnozstviIngTF1.setText(recept.getIngredience(1));
        nazevIngTF2.setText(recept.getIngredience(2));mnozstviIngTF2.setText(recept.getIngredience(3));
        nazevIngTF3.setText(recept.getIngredience(4));mnozstviIngTF3.setText(recept.getIngredience(5));
        nazevIngTF4.setText(recept.getIngredience(6));mnozstviIngTF4.setText(recept.getIngredience(7));
        nazevIngTF5.setText(recept.getIngredience(8));mnozstviIngTF5.setText(recept.getIngredience(9));
        nazevIngTF6.setText(recept.getIngredience(10));mnozstviIngTF6.setText(recept.getIngredience(11));
        nazevIngTF7.setText(recept.getIngredience(12));mnozstviIngTF7.setText(recept.getIngredience(13));
        nazevIngTF8.setText(recept.getIngredience(14));mnozstviIngTF8.setText(recept.getIngredience(15));
        nazevIngTF9.setText(recept.getIngredience(16));mnozstviIngTF9.setText(recept.getIngredience(17));
        nazevIngTF10.setText(recept.getIngredience(18));mnozstviIngTF10.setText(recept.getIngredience(19));
        nazevIngTF11.setText(recept.getIngredience(20));mnozstviIngTF11.setText(recept.getIngredience(21));
        nazevIngTF12.setText(recept.getIngredience(22));mnozstviIngTF12.setText(recept.getIngredience(23));
        nazevIngTF13.setText(recept.getIngredience(24));mnozstviIngTF13.setText(recept.getIngredience(25));
        nazevIngTF14.setText(recept.getIngredience(26));mnozstviIngTF14.setText(recept.getIngredience(27));
        nazevIngTF15.setText(recept.getIngredience(28));mnozstviIngTF15.setText(recept.getIngredience(29));
        nazevIngTF16.setText(recept.getIngredience(30));mnozstviIngTF16.setText(recept.getIngredience(31));
        nazevIngTF17.setText(recept.getIngredience(32));mnozstviIngTF17.setText(recept.getIngredience(33));
        nazevIngTF18.setText(recept.getIngredience(34));mnozstviIngTF18.setText(recept.getIngredience(35));
        nazevIngTF19.setText(recept.getIngredience(36));mnozstviIngTF19.setText(recept.getIngredience(37));
        nazevIngTF20.setText(recept.getIngredience(38));mnozstviIngTF20.setText(recept.getIngredience(39));
        //Blok pro načtení obrázku
        File file = new File("Recepty//Obrazky//" + nazevReceptuTF.getText() + ".jpg");
        if(file.exists()) {
            Image img = obr.nactiObrazek(nazevReceptuTF.getText());
            icon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(imgLabel.getWidth(), imgLabel.getHeight(), Image.SCALE_DEFAULT));
            imgLabel.setIcon(icon);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        popisReceptuPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        popisReceptuTA = new javax.swing.JTextArea();
        nactiImgBT = new javax.swing.JButton();
        ulozBT = new javax.swing.JToggleButton();
        rezimUpravRBT = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        imgLabel = new javax.swing.JLabel();
        nazevReceptuPanel = new javax.swing.JPanel();
        nazevReceptuTF = new javax.swing.JTextField();
        IngrediencePanel = new javax.swing.JPanel();
        nazevIngLabel = new javax.swing.JLabel();
        mnozstviIngLabel = new javax.swing.JLabel();
        nazevIngTF1 = new javax.swing.JTextField();
        nazevIngTF2 = new javax.swing.JTextField();
        nazevIngTF3 = new javax.swing.JTextField();
        nazevIngTF4 = new javax.swing.JTextField();
        nazevIngTF5 = new javax.swing.JTextField();
        nazevIngTF6 = new javax.swing.JTextField();
        nazevIngTF7 = new javax.swing.JTextField();
        nazevIngTF8 = new javax.swing.JTextField();
        nazevIngTF9 = new javax.swing.JTextField();
        nazevIngTF10 = new javax.swing.JTextField();
        mnozstviIngTF1 = new javax.swing.JTextField();
        mnozstviIngTF2 = new javax.swing.JTextField();
        mnozstviIngTF3 = new javax.swing.JTextField();
        mnozstviIngTF4 = new javax.swing.JTextField();
        mnozstviIngTF5 = new javax.swing.JTextField();
        mnozstviIngTF6 = new javax.swing.JTextField();
        mnozstviIngTF7 = new javax.swing.JTextField();
        mnozstviIngTF8 = new javax.swing.JTextField();
        mnozstviIngTF9 = new javax.swing.JTextField();
        mnozstviIngTF10 = new javax.swing.JTextField();
        nazevIngTF11 = new javax.swing.JTextField();
        nazevIngTF12 = new javax.swing.JTextField();
        nazevIngTF13 = new javax.swing.JTextField();
        nazevIngTF14 = new javax.swing.JTextField();
        nazevIngTF15 = new javax.swing.JTextField();
        nazevIngTF16 = new javax.swing.JTextField();
        nazevIngTF17 = new javax.swing.JTextField();
        nazevIngTF18 = new javax.swing.JTextField();
        nazevIngTF19 = new javax.swing.JTextField();
        nazevIngTF20 = new javax.swing.JTextField();
        mnozstviIngTF11 = new javax.swing.JTextField();
        mnozstviIngTF12 = new javax.swing.JTextField();
        mnozstviIngTF13 = new javax.swing.JTextField();
        mnozstviIngTF14 = new javax.swing.JTextField();
        mnozstviIngTF15 = new javax.swing.JTextField();
        mnozstviIngTF16 = new javax.swing.JTextField();
        mnozstviIngTF17 = new javax.swing.JTextField();
        mnozstviIngTF18 = new javax.swing.JTextField();
        mnozstviIngTF19 = new javax.swing.JTextField();
        mnozstviIngTF20 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(recept.getNazev());
        setAlwaysOnTop(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        popisReceptuPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Popis receptu"));
        popisReceptuPanel.setPreferredSize(new java.awt.Dimension(337, 586));

        popisReceptuTA.setEditable(setEditable);
        popisReceptuTA.setColumns(20);
        popisReceptuTA.setRows(5);
        jScrollPane1.setViewportView(popisReceptuTA);

        nactiImgBT.setEnabled(setEditable);
        nactiImgBT.setText("Načti obrázek");
        nactiImgBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nactiImgBTActionPerformed(evt);
            }
        });

        ulozBT.setEnabled(setEditable);
        ulozBT.setText("Ulož");
        ulozBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ulozBTActionPerformed(evt);
            }
        });

        rezimUpravRBT.setText("Režim úprav");
        rezimUpravRBT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rezimUpravRBTItemStateChanged(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout popisReceptuPanelLayout = new javax.swing.GroupLayout(popisReceptuPanel);
        popisReceptuPanel.setLayout(popisReceptuPanelLayout);
        popisReceptuPanelLayout.setHorizontalGroup(
            popisReceptuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popisReceptuPanelLayout.createSequentialGroup()
                .addComponent(nactiImgBT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ulozBT, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rezimUpravRBT, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        popisReceptuPanelLayout.setVerticalGroup(
            popisReceptuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popisReceptuPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(popisReceptuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nactiImgBT)
                    .addComponent(ulozBT)
                    .addComponent(rezimUpravRBT)))
        );

        nazevReceptuPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Název receptu"));

        nazevReceptuTF.setEditable(setEditable);

        javax.swing.GroupLayout nazevReceptuPanelLayout = new javax.swing.GroupLayout(nazevReceptuPanel);
        nazevReceptuPanel.setLayout(nazevReceptuPanelLayout);
        nazevReceptuPanelLayout.setHorizontalGroup(
            nazevReceptuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nazevReceptuTF)
        );
        nazevReceptuPanelLayout.setVerticalGroup(
            nazevReceptuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nazevReceptuTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        IngrediencePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingredience"));

        nazevIngLabel.setText("Název");

        mnozstviIngLabel.setText("Množství");

        nazevIngTF1.setEditable(setEditable);

        nazevIngTF2.setEditable(setEditable);

        nazevIngTF3.setEditable(setEditable);

        nazevIngTF4.setEditable(setEditable);

        nazevIngTF5.setEditable(setEditable);

        nazevIngTF6.setEditable(setEditable);

        nazevIngTF7.setEditable(setEditable);

        nazevIngTF8.setEditable(setEditable);

        nazevIngTF9.setEditable(setEditable);

        nazevIngTF10.setEditable(setEditable);

        mnozstviIngTF1.setEditable(setEditable);

        mnozstviIngTF2.setEditable(setEditable);

        mnozstviIngTF3.setEditable(setEditable);

        mnozstviIngTF4.setEditable(setEditable);

        mnozstviIngTF5.setEditable(setEditable);

        mnozstviIngTF6.setEditable(setEditable);

        mnozstviIngTF7.setEditable(setEditable);

        mnozstviIngTF8.setEditable(setEditable);

        mnozstviIngTF9.setEditable(setEditable);

        mnozstviIngTF10.setEditable(setEditable);

        nazevIngTF11.setEditable(setEditable);

        nazevIngTF12.setEditable(setEditable);

        nazevIngTF13.setEditable(setEditable);

        nazevIngTF14.setEditable(setEditable);

        nazevIngTF15.setEditable(setEditable);

        nazevIngTF16.setEditable(setEditable);

        nazevIngTF17.setEditable(setEditable);

        nazevIngTF18.setEditable(setEditable);

        nazevIngTF19.setEditable(setEditable);

        nazevIngTF20.setEditable(setEditable);

        mnozstviIngTF11.setEditable(setEditable);

        mnozstviIngTF12.setEditable(setEditable);

        mnozstviIngTF13.setEditable(setEditable);

        mnozstviIngTF14.setEditable(setEditable);

        mnozstviIngTF15.setEditable(setEditable);

        mnozstviIngTF16.setEditable(setEditable);

        mnozstviIngTF17.setEditable(setEditable);

        mnozstviIngTF18.setEditable(setEditable);

        mnozstviIngTF19.setEditable(setEditable);

        mnozstviIngTF20.setEditable(setEditable);

        javax.swing.GroupLayout IngrediencePanelLayout = new javax.swing.GroupLayout(IngrediencePanel);
        IngrediencePanel.setLayout(IngrediencePanelLayout);
        IngrediencePanelLayout.setHorizontalGroup(
            IngrediencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngrediencePanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(nazevIngLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mnozstviIngLabel)
                .addGap(26, 26, 26))
            .addGroup(IngrediencePanelLayout.createSequentialGroup()
                .addGroup(IngrediencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IngrediencePanelLayout.createSequentialGroup()
                        .addComponent(nazevIngTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mnozstviIngTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(IngrediencePanelLayout.createSequentialGroup()
                        .addComponent(nazevIngTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mnozstviIngTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(IngrediencePanelLayout.createSequentialGroup()
                        .addComponent(nazevIngTF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mnozstviIngTF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(IngrediencePanelLayout.createSequentialGroup()
                        .addComponent(nazevIngTF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mnozstviIngTF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(IngrediencePanelLayout.createSequentialGroup()
                        .addComponent(nazevIngTF5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mnozstviIngTF5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(IngrediencePanelLayout.createSequentialGroup()
                        .addComponent(nazevIngTF6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mnozstviIngTF6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(IngrediencePanelLayout.createSequentialGroup()
                        .addComponent(nazevIngTF7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mnozstviIngTF7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(IngrediencePanelLayout.createSequentialGroup()
                        .addComponent(nazevIngTF8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mnozstviIngTF8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(IngrediencePanelLayout.createSequentialGroup()
                        .addGroup(IngrediencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(IngrediencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(nazevIngTF10, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addComponent(nazevIngTF9))
                            .addComponent(nazevIngTF11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nazevIngTF12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nazevIngTF13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nazevIngTF14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nazevIngTF15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nazevIngTF16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nazevIngTF17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nazevIngTF18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nazevIngTF19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nazevIngTF20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(IngrediencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mnozstviIngTF20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mnozstviIngTF19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mnozstviIngTF18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mnozstviIngTF17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mnozstviIngTF16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mnozstviIngTF15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mnozstviIngTF14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mnozstviIngTF13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mnozstviIngTF12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mnozstviIngTF11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mnozstviIngTF10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mnozstviIngTF9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        IngrediencePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {mnozstviIngTF1, mnozstviIngTF10, mnozstviIngTF11, mnozstviIngTF12, mnozstviIngTF13, mnozstviIngTF14, mnozstviIngTF15, mnozstviIngTF16, mnozstviIngTF17, mnozstviIngTF18, mnozstviIngTF19, mnozstviIngTF2, mnozstviIngTF20, mnozstviIngTF3, mnozstviIngTF4, mnozstviIngTF5, mnozstviIngTF6, mnozstviIngTF7, mnozstviIngTF8, mnozstviIngTF9, nazevIngTF1, nazevIngTF10, nazevIngTF11, nazevIngTF12, nazevIngTF13, nazevIngTF14, nazevIngTF15, nazevIngTF16, nazevIngTF17, nazevIngTF18, nazevIngTF19, nazevIngTF2, nazevIngTF20, nazevIngTF3, nazevIngTF4, nazevIngTF5, nazevIngTF6, nazevIngTF7, nazevIngTF8, nazevIngTF9});

        IngrediencePanelLayout.setVerticalGroup(
            IngrediencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngrediencePanelLayout.createSequentialGroup()
                .addGroup(IngrediencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nazevIngLabel)
                    .addComponent(mnozstviIngLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngrediencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nazevIngTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mnozstviIngTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngrediencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nazevIngTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mnozstviIngTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngrediencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nazevIngTF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mnozstviIngTF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngrediencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nazevIngTF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mnozstviIngTF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngrediencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nazevIngTF5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mnozstviIngTF5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngrediencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nazevIngTF6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mnozstviIngTF6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngrediencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nazevIngTF7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mnozstviIngTF7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngrediencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nazevIngTF8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mnozstviIngTF8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngrediencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nazevIngTF9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mnozstviIngTF9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngrediencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nazevIngTF10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mnozstviIngTF10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngrediencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nazevIngTF11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mnozstviIngTF11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngrediencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nazevIngTF12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mnozstviIngTF12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngrediencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nazevIngTF13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mnozstviIngTF13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngrediencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nazevIngTF14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mnozstviIngTF14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngrediencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nazevIngTF15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mnozstviIngTF15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngrediencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nazevIngTF16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mnozstviIngTF16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngrediencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nazevIngTF17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mnozstviIngTF17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngrediencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nazevIngTF18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mnozstviIngTF18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngrediencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nazevIngTF19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mnozstviIngTF19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IngrediencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nazevIngTF20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mnozstviIngTF20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        IngrediencePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {mnozstviIngTF1, mnozstviIngTF10, mnozstviIngTF2, mnozstviIngTF3, mnozstviIngTF4, mnozstviIngTF5, mnozstviIngTF6, mnozstviIngTF7, mnozstviIngTF8, mnozstviIngTF9, nazevIngTF1, nazevIngTF10, nazevIngTF2, nazevIngTF3, nazevIngTF4, nazevIngTF5, nazevIngTF6, nazevIngTF7, nazevIngTF8, nazevIngTF9});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nazevReceptuPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(popisReceptuPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(IngrediencePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nazevReceptuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(popisReceptuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE))
                    .addComponent(IngrediencePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ulozBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ulozBTActionPerformed
        CookBookUI.CB.DB.vymazRecept(recept);
        CookBookUI.CB.DB.vymazReceptZeSlozky(recept);
        if(!nazevReceptuTF.getText().equals("")) {
            novyRecept.setNazev(nazevReceptuTF.getText());
            novyRecept.setPopis(popisReceptuTA.getText());
            novyRecept.setIngredience(nazevIngTF1.getText(), mnozstviIngTF1.getText());
            novyRecept.setIngredience(nazevIngTF2.getText(), mnozstviIngTF2.getText());
            novyRecept.setIngredience(nazevIngTF3.getText(), mnozstviIngTF3.getText());
            novyRecept.setIngredience(nazevIngTF4.getText(), mnozstviIngTF4.getText());
            novyRecept.setIngredience(nazevIngTF5.getText(), mnozstviIngTF5.getText());
            novyRecept.setIngredience(nazevIngTF6.getText(), mnozstviIngTF6.getText());
            novyRecept.setIngredience(nazevIngTF7.getText(), mnozstviIngTF7.getText());
            novyRecept.setIngredience(nazevIngTF8.getText(), mnozstviIngTF8.getText());
            novyRecept.setIngredience(nazevIngTF9.getText(), mnozstviIngTF9.getText());
            novyRecept.setIngredience(nazevIngTF10.getText(), mnozstviIngTF10.getText());
            novyRecept.setIngredience(nazevIngTF11.getText(), mnozstviIngTF11.getText());
            novyRecept.setIngredience(nazevIngTF12.getText(), mnozstviIngTF12.getText());
            novyRecept.setIngredience(nazevIngTF13.getText(), mnozstviIngTF13.getText());
            novyRecept.setIngredience(nazevIngTF14.getText(), mnozstviIngTF14.getText());
            novyRecept.setIngredience(nazevIngTF15.getText(), mnozstviIngTF15.getText());
            novyRecept.setIngredience(nazevIngTF16.getText(), mnozstviIngTF16.getText());
            novyRecept.setIngredience(nazevIngTF17.getText(), mnozstviIngTF17.getText());
            novyRecept.setIngredience(nazevIngTF18.getText(), mnozstviIngTF18.getText());
            novyRecept.setIngredience(nazevIngTF19.getText(), mnozstviIngTF19.getText());
            novyRecept.setIngredience(nazevIngTF20.getText(), mnozstviIngTF20.getText());
            if(!imgCesta.equals("")) {
                obr.vymazObrazek(nazevReceptuTF.getText());
                try {
                    obr.ulozObrazek(imgCesta, nazevReceptuTF.getText());
                } catch (IOException ex) {
                    Logger.getLogger(RecipeWindow.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalArgumentException e) {
                    System.out.println("Obrázek není ve zprávném formátu");
                }
            }
            CookBookUI.CB.DB.ulozRecept(novyRecept);
            //System.out.println(CookBookUI.CB.DB.testUlozeni());
        }
        CookBookUI.CB.DB.nactiNazvy(CookBookUI.CB.nazvyReceptuList);
        this.dispose();
    }//GEN-LAST:event_ulozBTActionPerformed

    private void rezimUpravRBTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rezimUpravRBTItemStateChanged
        setEditable = !setEditable;
        nazevReceptuTF.setEditable(setEditable);
        popisReceptuTA.setEditable(setEditable);
        nazevIngTF1.setEditable(setEditable); mnozstviIngTF1.setEditable(setEditable);
        nazevIngTF2.setEditable(setEditable); mnozstviIngTF2.setEditable(setEditable);
        nazevIngTF3.setEditable(setEditable); mnozstviIngTF3.setEditable(setEditable);
        nazevIngTF4.setEditable(setEditable); mnozstviIngTF4.setEditable(setEditable);
        nazevIngTF5.setEditable(setEditable); mnozstviIngTF5.setEditable(setEditable);
        nazevIngTF6.setEditable(setEditable); mnozstviIngTF6.setEditable(setEditable);
        nazevIngTF7.setEditable(setEditable); mnozstviIngTF7.setEditable(setEditable);
        nazevIngTF8.setEditable(setEditable); mnozstviIngTF8.setEditable(setEditable);
        nazevIngTF9.setEditable(setEditable); mnozstviIngTF9.setEditable(setEditable);
        nazevIngTF10.setEditable(setEditable); mnozstviIngTF10.setEditable(setEditable);
        nazevIngTF11.setEditable(setEditable); mnozstviIngTF11.setEditable(setEditable);
        nazevIngTF12.setEditable(setEditable); mnozstviIngTF12.setEditable(setEditable);
        nazevIngTF13.setEditable(setEditable); mnozstviIngTF13.setEditable(setEditable);
        nazevIngTF14.setEditable(setEditable); mnozstviIngTF14.setEditable(setEditable);
        nazevIngTF15.setEditable(setEditable); mnozstviIngTF15.setEditable(setEditable);
        nazevIngTF16.setEditable(setEditable); mnozstviIngTF16.setEditable(setEditable);
        nazevIngTF17.setEditable(setEditable); mnozstviIngTF17.setEditable(setEditable);
        nazevIngTF18.setEditable(setEditable); mnozstviIngTF18.setEditable(setEditable);
        nazevIngTF19.setEditable(setEditable); mnozstviIngTF19.setEditable(setEditable);
        nazevIngTF20.setEditable(setEditable); mnozstviIngTF20.setEditable(setEditable);
        nactiImgBT.setEnabled(setEditable);
        ulozBT.setEnabled(setEditable);
    }//GEN-LAST:event_rezimUpravRBTItemStateChanged

    private void nactiImgBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nactiImgBTActionPerformed
        if(evt.getSource() == nactiImgBT) {
            int returnVal = FC.showOpenDialog(jPanel1);
            if(returnVal == JFileChooser.APPROVE_OPTION) {
                imgCesta = FC.getSelectedFile().getAbsolutePath();
                System.out.println(imgCesta); //test
            }
        }
        img = t.getImage(imgCesta);
        icon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(imgLabel.getWidth(), imgLabel.getHeight(), Image.SCALE_DEFAULT));
        imgLabel.setIcon(icon);
    }//GEN-LAST:event_nactiImgBTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RecipeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecipeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecipeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecipeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(() -> {
            new RecipeWindow().setVisible(true);
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel IngrediencePanel;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mnozstviIngLabel;
    private javax.swing.JTextField mnozstviIngTF1;
    private javax.swing.JTextField mnozstviIngTF10;
    private javax.swing.JTextField mnozstviIngTF11;
    private javax.swing.JTextField mnozstviIngTF12;
    private javax.swing.JTextField mnozstviIngTF13;
    private javax.swing.JTextField mnozstviIngTF14;
    private javax.swing.JTextField mnozstviIngTF15;
    private javax.swing.JTextField mnozstviIngTF16;
    private javax.swing.JTextField mnozstviIngTF17;
    private javax.swing.JTextField mnozstviIngTF18;
    private javax.swing.JTextField mnozstviIngTF19;
    private javax.swing.JTextField mnozstviIngTF2;
    private javax.swing.JTextField mnozstviIngTF20;
    private javax.swing.JTextField mnozstviIngTF3;
    private javax.swing.JTextField mnozstviIngTF4;
    private javax.swing.JTextField mnozstviIngTF5;
    private javax.swing.JTextField mnozstviIngTF6;
    private javax.swing.JTextField mnozstviIngTF7;
    private javax.swing.JTextField mnozstviIngTF8;
    private javax.swing.JTextField mnozstviIngTF9;
    private javax.swing.JButton nactiImgBT;
    private javax.swing.JLabel nazevIngLabel;
    private javax.swing.JTextField nazevIngTF1;
    private javax.swing.JTextField nazevIngTF10;
    private javax.swing.JTextField nazevIngTF11;
    private javax.swing.JTextField nazevIngTF12;
    private javax.swing.JTextField nazevIngTF13;
    private javax.swing.JTextField nazevIngTF14;
    private javax.swing.JTextField nazevIngTF15;
    private javax.swing.JTextField nazevIngTF16;
    private javax.swing.JTextField nazevIngTF17;
    private javax.swing.JTextField nazevIngTF18;
    private javax.swing.JTextField nazevIngTF19;
    private javax.swing.JTextField nazevIngTF2;
    private javax.swing.JTextField nazevIngTF20;
    private javax.swing.JTextField nazevIngTF3;
    private javax.swing.JTextField nazevIngTF4;
    private javax.swing.JTextField nazevIngTF5;
    private javax.swing.JTextField nazevIngTF6;
    private javax.swing.JTextField nazevIngTF7;
    private javax.swing.JTextField nazevIngTF8;
    private javax.swing.JTextField nazevIngTF9;
    private javax.swing.JPanel nazevReceptuPanel;
    private javax.swing.JTextField nazevReceptuTF;
    private javax.swing.JPanel popisReceptuPanel;
    private javax.swing.JTextArea popisReceptuTA;
    private javax.swing.JRadioButton rezimUpravRBT;
    private javax.swing.JToggleButton ulozBT;
    // End of variables declaration//GEN-END:variables
}
