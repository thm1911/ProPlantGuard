package view;


import Model.Tree;
import java.awt.Component;
import java.awt.HeadlessException;
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
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import view.Homepage;
public class ListFruit extends javax.swing.JFrame {
    public String nameFile = "C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\Data\\FRUIT.txt";
    public ListFruit() {
        initComponents();
        Homepage home = new Homepage();
        home.Edit(homeItem, flowerItem, fruitItem, vegetableItem, searchItem);
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
            Object[] newRow = {fruit.get(i).getName(),"Chi tiết"," "};
            model.addRow(newRow);
            
            TableColumn column2 = fruitTable.getColumnModel().getColumn(1);
            column2.setCellEditor(new ClassRendered.ButtonEditor(fruit, new JTextField(), nameFile));
            column2.setCellRenderer(new ClassRendered.ButtonRenderer());
            
            TableColumn column3 = fruitTable.getColumnModel().getColumn(2);
            column3.setCellEditor(new ClassRendered.CheckBoxEditor(model, fruit, new JTextField(), nameFile));
            column3.setCellRenderer(new ClassRendered.CheckBoxRendered());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        fruitTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        homeItem = new javax.swing.JMenuItem();
        flowerItem = new javax.swing.JMenuItem();
        fruitItem = new javax.swing.JMenuItem();
        vegetableItem = new javax.swing.JMenuItem();
        addTreeMenu = new javax.swing.JMenu();
        addTreeItem = new javax.swing.JMenuItem();
        searchItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ProPlanGuard");
        setIconImage(new ClassRendered().icon.getImage());

        fruitTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên", "Thông tin chi tiết", "Xóa cây"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(fruitTable);

        jScrollPane1.setViewportView(jEditorPane1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(321, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel4);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("FRUIT");

        jMenu1.setText("View");

        homeItem.setText("Home");
        homeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeItemActionPerformed(evt);
            }
        });
        jMenu1.add(homeItem);

        flowerItem.setText("Flower");
        flowerItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flowerItemActionPerformed(evt);
            }
        });
        jMenu1.add(flowerItem);

        fruitItem.setText("Fruit");
        fruitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fruitItemActionPerformed(evt);
            }
        });
        jMenu1.add(fruitItem);

        vegetableItem.setText("Vegetable");
        vegetableItem.setToolTipText("");
        vegetableItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vegetableItemActionPerformed(evt);
            }
        });
        jMenu1.add(vegetableItem);

        jMenuBar1.add(jMenu1);

        addTreeMenu.setText("Edit");

        addTreeItem.setText("AddTree");
        addTreeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTreeItemActionPerformed(evt);
            }
        });
        addTreeMenu.add(addTreeItem);

        searchItem.setText("Tìm kiếm");
        addTreeMenu.add(searchItem);

        jMenuBar1.add(addTreeMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addGap(75, 75, 75))
        );

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
                                               
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem addTreeItem;
    public javax.swing.JMenu addTreeMenu;
    public javax.swing.JMenuItem flowerItem;
    public javax.swing.JMenuItem fruitItem;
    public javax.swing.JTable fruitTable;
    public javax.swing.JMenuItem homeItem;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JMenuItem searchItem;
    public javax.swing.JMenuItem vegetableItem;
    // End of variables declaration//GEN-END:variables

    private static class DefautCellEditor {

        public DefautCellEditor() {
        }
    }
}
