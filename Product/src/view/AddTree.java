
package view;
import Controller.AddNewTree;
import Model.Tree;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class AddTree extends javax.swing.JFrame {
    
    public String nameFile, imagePath;
    public boolean check = false;
    public AddTree() {
        initComponents();
    }
    public ImageIcon icon = new ImageIcon("‪C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\src\\Image\\png-clipart-seed-computer-icons-sprouting-grow-plant-leaf-branch.png");
    public Image doneImage = new ImageIcon("C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\src\\Image\\tải_xuống-removebg-preview (1).png").getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
    public Image exitImage = new ImageIcon("C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\src\\Image\\1200px-Flat_cross_icon.svg.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
    public Image cameraImage = new ImageIcon("C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\src\\Image\\kisspng-computer-icons-camera-photography-5ae221306ada91.9319799815247690724377-removebg-preview.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);

    
    public void GetNameFile(String name){
        nameFile = name;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChoose = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        propertiesField = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        plantTreeField = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        usesField = new javax.swing.JTextArea();
        imageLabel = new javax.swing.JLabel();
        doneLabel = new javax.swing.JLabel();
        exitLabel = new javax.swing.JLabel();
        getImageLabel = new javax.swing.JLabel();

        fileChoose.setCurrentDirectory(new java.io.File("C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\src\\Image"));

        setTitle("ProPlantGuard");
        setIconImage(new ClassRendered().icon.getImage());
        setResizable(false);

        jLabel1.setText("1. Tên cây");

        nameField.setForeground(new java.awt.Color(0, 0, 0));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("2. Đặc điểm");

        jLabel3.setText("3. Cách chăm sóc");

        propertiesField.setColumns(20);
        propertiesField.setForeground(new java.awt.Color(0, 0, 0));
        propertiesField.setRows(5);
        jScrollPane1.setViewportView(propertiesField);

        plantTreeField.setColumns(20);
        plantTreeField.setForeground(new java.awt.Color(0, 0, 0));
        plantTreeField.setRows(5);
        plantTreeField.setToolTipText("");
        plantTreeField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                plantTreeFieldFocusGained(evt);
            }
        });
        jScrollPane2.setViewportView(plantTreeField);

        jLabel4.setText("4. Link ảnh");

        jLabel5.setText("5. Công dụng ");

        usesField.setColumns(20);
        usesField.setForeground(new java.awt.Color(0, 0, 0));
        usesField.setRows(5);
        usesField.setToolTipText("");
        jScrollPane3.setViewportView(usesField);

        doneLabel.setIcon(new ImageIcon(doneImage));
        doneLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doneLabelMouseClicked(evt);
            }
        });

        exitLabel.setIcon(new ImageIcon(exitImage));
        exitLabel.setOpaque(true);
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });

        getImageLabel.setIcon(new ImageIcon(cameraImage));
        getImageLabel.setOpaque(true);
        getImageLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getImageLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel5)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116)
                                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(getImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(doneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(getImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(jLabel2)))))
                        .addGap(13, 13, 13)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(doneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void plantTreeFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plantTreeFieldFocusGained
       plantTreeField.setText(" ");
    }//GEN-LAST:event_plantTreeFieldFocusGained

    private void doneLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneLabelMouseClicked
        String name = nameField.getText();
        String properties = propertiesField.getText();
        String plantTree = plantTreeField.getText();
        String uses = usesField.getText();
       
        Tree newTree = new Tree(name, properties, plantTree, imagePath, uses);
        AddNewTree add = new AddNewTree();
        add.AddNewTree(newTree, nameFile);
        if(nameFile == "C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\Data\\FLOWER.txt"){
            ListFlower flower = new ListFlower();
            flower.showTable();
            flower.setVisible(true);
        }
        else if(nameFile == "C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\Data\\FRUIT.txt"){
            ListFruit fruit = new ListFruit();
            fruit.showTable();
            fruit.setVisible(true);
        }
        else if(nameFile == "C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\Data\\VEGETABLE.txt"){
            ListVegetable veget = new ListVegetable();
            veget.showTable();
            veget.setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_doneLabelMouseClicked

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        if(nameFile == "C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\Data\\FLOWER.txt"){
            ListFlower flower = new ListFlower();
            flower.showTable();
            flower.setVisible(true);
        }
        else if(nameFile == "C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\Data\\FRUIT.txt"){
            ListFruit fruit = new ListFruit();
            fruit.showTable();
            fruit.setVisible(true);
        }
        else if(nameFile == "C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\Data\\VEGETABLE.txt"){
            ListVegetable veget = new ListVegetable();
            veget.showTable();
            veget.setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_exitLabelMouseClicked

    private void getImageLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getImageLabelMouseClicked
       JFileChooser fileChooser = new JFileChooser("C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\src\\Image");
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();
            imagePath = filePath;
             
            int width = imageLabel.getWidth();
            int height = imageLabel.getHeight();

            ImageIcon image = new ImageIcon(filePath);
            ImageIcon imageResize = new ImageIcon(image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
            imageLabel.setIcon(imageResize);
         }
    }//GEN-LAST:event_getImageLabelMouseClicked

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel doneLabel;
    public javax.swing.JLabel exitLabel;
    public javax.swing.JFileChooser fileChoose;
    private javax.swing.JLabel getImageLabel;
    public javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTextField nameField;
    public javax.swing.JTextArea plantTreeField;
    public javax.swing.JTextArea propertiesField;
    public javax.swing.JTextArea usesField;
    // End of variables declaration//GEN-END:variables

}
