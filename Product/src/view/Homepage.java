package view;



import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import view.ListFlower;

public class Homepage extends javax.swing.JFrame {
    
    public Homepage() {
        initComponents();
        Edit(homeItem, flowerItem, fruitItem, vegetableItem, searchItem);
        ImageIcon image = new ImageIcon("C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\src\\Image\\1306_game-nong-trai-2.jpg");
        int width = labelBackground.getWidth();
        int height = labelBackground.getHeight();
        ImageIcon resizeImage = new ImageIcon(image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
        
        labelBackground.setIcon(resizeImage);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        labelBackground = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        homeItem = new javax.swing.JMenuItem();
        flowerItem = new javax.swing.JMenuItem();
        fruitItem = new javax.swing.JMenuItem();
        vegetableItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        searchItem = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ProPlanGuard");
        setBackground(new java.awt.Color(255, 102, 102));
        setIconImage(new ClassRendered().icon.getImage());
        setLocation(new java.awt.Point(0, 0));

        jMenu2.setText("View");

        homeItem.setText("Home");
        homeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeItemActionPerformed(evt);
            }
        });
        jMenu2.add(homeItem);

        flowerItem.setText("Flower");
        flowerItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flowerItemActionPerformed(evt);
            }
        });
        jMenu2.add(flowerItem);

        fruitItem.setText("Fruit");
        fruitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fruitItemActionPerformed(evt);
            }
        });
        jMenu2.add(fruitItem);

        vegetableItem.setText("Vegetable");
        vegetableItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vegetableItemActionPerformed(evt);
            }
        });
        jMenu2.add(vegetableItem);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Search");

        searchItem.setText("Tìm kiếm");
        searchItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchItemActionPerformed(evt);
            }
        });
        jMenu3.add(searchItem);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void Edit(JMenuItem homeItem, JMenuItem flowerItem, JMenuItem fruitItem, JMenuItem vegetableItem, JMenuItem searchItem){
        ImageIcon homeImage = new ImageIcon("C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\src\\Image\\25694.png");
        Image homeImageResize = homeImage.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        homeItem.setIcon(new ImageIcon(homeImageResize));
        
        ImageIcon flowerImage = new ImageIcon("C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\src\\Image\\295895.png");
        Image flowerImageResize = flowerImage.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        flowerItem.setIcon(new ImageIcon(flowerImageResize));
        
        ImageIcon fruitImage = new ImageIcon("C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\src\\Image\\1242331-200.png");
        Image fruitImageResize = fruitImage.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        fruitItem.setIcon(new ImageIcon(fruitImageResize));
        
        ImageIcon vegetImage = new ImageIcon("C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\src\\Image\\135253.png");
        Image vegetImageResize = vegetImage.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        vegetableItem.setIcon(new ImageIcon(vegetImageResize));
        
        ImageIcon searchImage = new ImageIcon("C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\src\\Image\\pngtree-vector-search-icon-png-image_966647.jpg");
        Image searchImageResize = searchImage.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        searchItem.setIcon(new ImageIcon(searchImageResize));
    }
    private void homeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeItemActionPerformed
        Homepage home = new Homepage();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeItemActionPerformed

    private void flowerItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flowerItemActionPerformed
        ListFlower flower = new ListFlower();
        flower.showTable();
        flower.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_flowerItemActionPerformed

    private void fruitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fruitItemActionPerformed
        ListFruit fruit = new ListFruit();
        fruit.showTable();
        fruit.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_fruitItemActionPerformed

    private void vegetableItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vegetableItemActionPerformed
        ListVegetable veget = new ListVegetable();
        veget.showTable();
        veget.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_vegetableItemActionPerformed

    private void searchItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchItemActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
               new Homepage().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem flowerItem;
    public javax.swing.JMenuItem fruitItem;
    public javax.swing.JMenuItem homeItem;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JLabel labelBackground;
    public javax.swing.JMenuItem searchItem;
    public javax.swing.JMenuItem vegetableItem;
    // End of variables declaration//GEN-END:variables
}
