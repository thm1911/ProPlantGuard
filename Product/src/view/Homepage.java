package view;



import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import view.ListFlower;
import Controller.SearchTree;
import Model.Tree;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Homepage extends javax.swing.JFrame {
    public int withLabel = 360;
    public int heightLabel = 455;
    public Image searchImage1 = new ImageIcon("C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\src\\Image\\search-icon-2-614x460.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
    public Image searchImage2 = new ImageIcon("C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\src\\Image\\search-icon-2-614x460.png").getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
    public Image exitImage = new ImageIcon("C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\src\\Image\\images.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
    public Image notice = new ImageIcon("C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\src\\Image\\sign-warning-icon-png-7.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    public Image deleteImage = new ImageIcon("C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\src\\Image\\1200px-Flat_cross_icon.svg.png").getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
    
    public String flowerFile = "C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\Data\\FLOWER.txt";
    public String fruitFile = "C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\Data\\FRUIT.txt";
    public String vegetFile = "C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\Data\\VEGETABLE.txt";
    
    public String GetKeyWord(){
        return searchBar.getText();
    }
    
    public boolean GetNameCheckBox(){
        return nameButton.isSelected();
    }
    
    public boolean GetKeyWordCheckBox(){
        return keyWordButton.isSelected();
    }
    
    public Homepage() {
        initComponents();
        Edit(homeItem, flowerItem, fruitItem, vegetableItem);
        ImageIcon image = new ImageIcon("C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\src\\Image\\1306_game-nong-trai-2.jpg");
        int width = labelBackground.getWidth();
        int height = labelBackground.getHeight();
        ImageIcon resizeImage = new ImageIcon(image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
        labelBackground.setIcon(resizeImage);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        dialog1 = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        noticeLabel = new javax.swing.JLabel();
        OKButton = new javax.swing.JButton();
        noticeImage = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        labelBackground = new javax.swing.JLabel();
        searchMenu = new javax.swing.JPanel();
        searchBar = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        flowerButton = new javax.swing.JRadioButton();
        fruitButon = new javax.swing.JRadioButton();
        vegetButton = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        nameButton = new javax.swing.JRadioButton();
        keyWordButton = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        homeItem = new javax.swing.JMenuItem();
        flowerItem = new javax.swing.JMenuItem();
        fruitItem = new javax.swing.JMenuItem();
        vegetableItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        searchItem = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 292, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );

        dialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        dialog1.setTitle("Cảnh báo");
        dialog1.setIconImage(new ClassRendered().iconNotice.getImage());
        dialog1.setModal(true);
        dialog1.setResizable(false);

        noticeLabel.setText("Không tìm thấy!");
        noticeLabel.setToolTipText("");

        OKButton.setText("OK");
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });

        noticeImage.setIcon(new ImageIcon(notice));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(noticeImage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(noticeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(OKButton)
                .addGap(65, 65, 65))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(noticeImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(noticeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OKButton)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialog1Layout = new javax.swing.GroupLayout(dialog1.getContentPane());
        dialog1.getContentPane().setLayout(dialog1Layout);
        dialog1Layout.setHorizontalGroup(
            dialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialog1Layout.setVerticalGroup(
            dialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ProPlanGuard");
        setBackground(new java.awt.Color(255, 102, 102));
        setIconImage(new ClassRendered().icon.getImage());
        setLocation(new java.awt.Point(0, 0));

        searchMenu.setPreferredSize(new java.awt.Dimension(4, 455));
        searchMenu.setRequestFocusEnabled(false);

        searchBar.setToolTipText("");
        searchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBarActionPerformed(evt);
            }
        });

        searchButton.setIcon(new ImageIcon(searchImage2));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        exitButton.setIcon(new ImageIcon(exitImage));
        exitButton.setToolTipText("");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("* Tìm kiếm theo:");

        jScrollPane1.setPreferredSize(new java.awt.Dimension(410, 455));

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên cây trồng", "Thông tin", "Thứ tự trong danh sách"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(resultTable);
        if (resultTable.getColumnModel().getColumnCount() > 0) {
            resultTable.getColumnModel().getColumn(0).setResizable(false);
            resultTable.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("* Loại cây trồng:");
        jLabel2.setOpaque(true);

        buttonGroup1.add(flowerButton);
        flowerButton.setText("Hoa");

        buttonGroup1.add(fruitButon);
        fruitButon.setText("Quả");

        buttonGroup1.add(vegetButton);
        vegetButton.setText("Rau");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(flowerButton)
                    .addComponent(fruitButon)
                    .addComponent(vegetButton))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(flowerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fruitButon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vegetButton)
                .addGap(18, 18, 18))
        );

        buttonGroup2.add(nameButton);
        nameButton.setText("Tên cây");

        buttonGroup2.add(keyWordButton);
        keyWordButton.setText("Từ khóa");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameButton)
                    .addComponent(keyWordButton))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(nameButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(keyWordButton)
                .addContainerGap())
        );

        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("* : Đây là trường bắt buộc");
        jLabel4.setOpaque(true);

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nhập từ khóa tìm kiếm: ");

        javax.swing.GroupLayout searchMenuLayout = new javax.swing.GroupLayout(searchMenu);
        searchMenu.setLayout(searchMenuLayout);
        searchMenuLayout.setHorizontalGroup(
            searchMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchMenuLayout.createSequentialGroup()
                .addGroup(searchMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchMenuLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(searchMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(searchMenuLayout.createSequentialGroup()
                                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(searchMenuLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(searchMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(searchMenuLayout.createSequentialGroup()
                                .addGroup(searchMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(searchMenuLayout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(searchMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addComponent(jLabel4))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        searchMenuLayout.setVerticalGroup(
            searchMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchMenuLayout.createSequentialGroup()
                .addGroup(searchMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchMenuLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(searchMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(searchMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(searchMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

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

        searchItem.setIcon(new ImageIcon(searchImage1));
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(searchMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(searchMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void Edit(JMenuItem homeItem, JMenuItem flowerItem, JMenuItem fruitItem, JMenuItem vegetableItem){
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
             
    }
    
    public void OpenSearchLabel(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i <= withLabel; i++){
                    searchMenu.setSize(withLabel, heightLabel);
                }
            }
        }).start();
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
        OpenSearchLabel();
    }//GEN-LAST:event_searchItemActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        Homepage home = new Homepage();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed
    public void PrintResult(String nameFile){
        DefaultTableModel model = (DefaultTableModel) resultTable.getModel();
        ArrayList<Tree> list = new ArrayList<>();
        
        SearchTree searchTree = new SearchTree();
        searchTree.Search(list, model,nameFile, searchBar.getText(), nameButton.isSelected(), keyWordButton.isSelected(), dialog1);
        TableColumn column = resultTable.getColumnModel().getColumn(1);
        column.setCellRenderer(new ClassRendered.ButtonRenderer());
        column.setCellEditor(new ClassRendered.ButtonEditor(list, new JTextField(),nameFile));
        
    }
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        
        if(flowerButton.isSelected()) PrintResult(flowerFile);
        else if(fruitButon.isSelected()) PrintResult(fruitFile);
        else if(vegetButton.isSelected()) PrintResult(vegetFile);
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        dialog1.setVisible(false);
    }//GEN-LAST:event_OKButtonActionPerformed

    private void searchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBarActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
               new Homepage().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton OKButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    public javax.swing.JDialog dialog1;
    private javax.swing.JButton exitButton;
    public javax.swing.JRadioButton flowerButton;
    public javax.swing.JMenuItem flowerItem;
    public javax.swing.JRadioButton fruitButon;
    public javax.swing.JMenuItem fruitItem;
    public javax.swing.JMenuItem homeItem;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JRadioButton keyWordButton;
    public javax.swing.JLabel labelBackground;
    public javax.swing.JRadioButton nameButton;
    private javax.swing.JLabel noticeImage;
    public javax.swing.JLabel noticeLabel;
    public javax.swing.JTable resultTable;
    public javax.swing.JTextField searchBar;
    private javax.swing.JButton searchButton;
    public javax.swing.JMenuItem searchItem;
    public javax.swing.JPanel searchMenu;
    public javax.swing.JRadioButton vegetButton;
    public javax.swing.JMenuItem vegetableItem;
    // End of variables declaration//GEN-END:variables
}
