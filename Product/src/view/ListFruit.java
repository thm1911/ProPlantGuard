package view;


import Model.Tree;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.management.Query.value;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import view.Homepage;
public class ListFruit extends javax.swing.JFrame { 
    public String nameFile = "C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\Data\\FRUIT.txt";
    public ListFruit currentFrame;
    public ListFruit() {
        initComponents();
        currentFrame = this;
        int widthBG = backgroundLabel.getWidth();
        int heightBG = backgroundLabel.getHeight();
        Image bg = new ImageIcon("C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\src\\Image\\grapes-strawberries-pineapple-9891-3148-1657703608.jpg").getImage().getScaledInstance(widthBG, heightBG, Image.SCALE_SMOOTH);
        backgroundLabel.setIcon(new ImageIcon(bg));
        Homepage home = new Homepage();
        home.Edit(homeItem, flowerItem, fruitItem, vegetableItem);
        EditAddTree();
    }
    
    public void showTable(){
        ArrayList<Tree> fruit = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel)fruitTable.getModel();
        FileReader reader = null;
        Tree currentTree = null;
        try {
            reader = new FileReader(nameFile);
            BufferedReader br = new BufferedReader(reader);
            while(br.ready()==true){
                String name = br.readLine();
                String properties = br.readLine();
                String plantTree = br.readLine();
                String imagePath = br.readLine();
                String uses = br.readLine();
                currentTree = new Tree(name, properties, plantTree, imagePath, uses);
                fruit.add(currentTree);
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ListFruit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ListFruit.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i = 0; i< fruit.size();i++){
            Object[] newRow = {fruit.get(i).getName(),"Chi tiết", i, "Xóa"};
            model.addRow(newRow);
            TableColumn column2 = fruitTable.getColumnModel().getColumn(1);
            column2.setCellEditor(new ClassRendered.ButtonEditor(fruit, new JTextField(), nameFile));
            column2.setCellRenderer(new ClassRendered.ButtonRenderer());

            TableColumn column3 = fruitTable.getColumnModel().getColumn(3);
            column3.setCellEditor(new ClassRendered.ButtonDelete(model, fruit, new JTextField(), nameFile, currentFrame));
            column3.setCellRenderer(new ClassRendered.ButtonRenderer());
        }

        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        fruitTable = new javax.swing.JTable();
        backgroundLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        homeItem = new javax.swing.JMenuItem();
        flowerItem = new javax.swing.JMenuItem();
        fruitItem = new javax.swing.JMenuItem();
        vegetableItem = new javax.swing.JMenuItem();
        addTreeMenu = new javax.swing.JMenu();
        addTreeItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ProPlanGuard");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(new ClassRendered().icon.getImage());
        setLocation(new java.awt.Point(500, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fruitTable.setBackground(new java.awt.Color(255, 255, 255));
        fruitTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên", "Thông tin ", "Id", "Xóa cây"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(fruitTable);
        if (fruitTable.getColumnModel().getColumnCount() > 0) {
            fruitTable.getColumnModel().getColumn(0).setResizable(false);
            fruitTable.getColumnModel().getColumn(1).setResizable(false);
            fruitTable.getColumnModel().getColumn(2).setResizable(false);
            fruitTable.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel4);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 550, 348));
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 460));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setOpaque(true);

        jMenu1.setBackground(new java.awt.Color(204, 255, 204));
        jMenu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setForeground(new java.awt.Color(51, 51, 51));
        jMenu1.setText("View");
        jMenu1.setOpaque(true);

        homeItem.setBackground(new java.awt.Color(255, 255, 255));
        homeItem.setText("Home");
        homeItem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        homeItem.setOpaque(true);
        homeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeItemActionPerformed(evt);
            }
        });
        jMenu1.add(homeItem);

        flowerItem.setBackground(new java.awt.Color(255, 255, 255));
        flowerItem.setText("Flower");
        flowerItem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        flowerItem.setOpaque(true);
        flowerItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flowerItemActionPerformed(evt);
            }
        });
        jMenu1.add(flowerItem);

        fruitItem.setBackground(new java.awt.Color(255, 255, 255));
        fruitItem.setText("Fruit");
        fruitItem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fruitItem.setOpaque(true);
        fruitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fruitItemActionPerformed(evt);
            }
        });
        jMenu1.add(fruitItem);

        vegetableItem.setBackground(new java.awt.Color(255, 255, 255));
        vegetableItem.setText("Vegetable");
        vegetableItem.setToolTipText("");
        vegetableItem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        vegetableItem.setOpaque(true);
        vegetableItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vegetableItemActionPerformed(evt);
            }
        });
        jMenu1.add(vegetableItem);

        jMenuBar1.add(jMenu1);

        addTreeMenu.setBackground(new java.awt.Color(255, 204, 204));
        addTreeMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addTreeMenu.setForeground(new java.awt.Color(51, 51, 51));
        addTreeMenu.setText("Edit");
        addTreeMenu.setOpaque(true);

        addTreeItem.setBackground(new java.awt.Color(255, 255, 255));
        addTreeItem.setText("Thêm cây");
        addTreeItem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addTreeItem.setOpaque(true);
        addTreeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTreeItemActionPerformed(evt);
            }
        });
        addTreeMenu.add(addTreeItem);

        jMenuBar1.add(addTreeMenu);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void EditAddTree(){
        ImageIcon addTreeImage = new ImageIcon("C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\src\\Image\\kisspng-computer-icons-clip-art-plus-sign-5b32d918dd6a99.8147865815300590329069.jpg");
        Image addTreeResize =addTreeImage.getImage().getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        addTreeItem.setIcon(new ImageIcon(addTreeResize));
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

    private void addTreeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTreeItemActionPerformed
        AddTree add = new AddTree();
        add.GetNameFile(nameFile);
        add.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addTreeItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem addTreeItem;
    public javax.swing.JMenu addTreeMenu;
    public javax.swing.JLabel backgroundLabel;
    public javax.swing.JMenuItem flowerItem;
    public javax.swing.JMenuItem fruitItem;
    public javax.swing.JTable fruitTable;
    public javax.swing.JMenuItem homeItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JMenuItem vegetableItem;
    // End of variables declaration//GEN-END:variables

}
