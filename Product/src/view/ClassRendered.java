
package view;

import Controller.DeleteTree;
import Model.Tree;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class ClassRendered {
    public static ImageIcon icon = new ImageIcon("C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\src\\Image\\plant-icon-png-10.png");
    public static ImageIcon iconNotice = new ImageIcon("C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\src\\Image\\sign-warning-icon-png-7.png");
    static class ButtonRenderer extends JButton implements TableCellRenderer {
        public ButtonRenderer() {
            setOpaque(true);
        }
       
        @Override
         public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
             setText((value == null) ? "" : value.toString());
             return this;
         }
    }

    static class ButtonEditor extends DefaultCellEditor {
        public JButton button;
        public int rowIndex;
  
        public ButtonEditor(ArrayList<Tree> list,JTextField txt, String nameFile) {
            super(txt);
            button = new JButton();
            button.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Information infor = new Information(list, rowIndex,nameFile);
                    infor.setVisible(true);
                }
            });
            
        }
          
        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            button.setText((value == null) ? "" : value.toString());
            int tmp = 0;
            if(table.getValueAt(row, 2) instanceof Integer) tmp = (int)table.getValueAt(row, 2);
            else if(table.getValueAt(row, 2 )instanceof String)  tmp = Integer.parseInt((String) table.getValueAt(row, 2));
           
            rowIndex = tmp;
            return button;
        }
        
        @Override
        public Object getCellEditorValue() {
            return button.getText();
        }
    }
    
    static class CheckBoxRendered extends JCheckBox implements TableCellRenderer{
        public CheckBoxRendered(){
            setOpaque(true);
        }
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
             setText((value == null) ? "" : value.toString());
             return this;
         }
    }
    
    static class CheckBoxEditor extends DefaultCellEditor{
        public JCheckBox checkBox;
        public int rowIndex;
        
        public CheckBoxEditor(DefaultTableModel model, ArrayList<Tree> list,JTextField txt, String nameFile) {
            super(txt);
            checkBox = new JCheckBox();
            checkBox.setSelected(false);
            checkBox.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (checkBox.isSelected() == true){
                        model.removeRow(rowIndex);
                        DeleteTree delete = new DeleteTree();
                        delete.DeleteTree(rowIndex, list, nameFile);
                    }
                }
            });
            
        }
          
        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            checkBox.setText((value == null) ? "" : value.toString());
            rowIndex = row;
            return checkBox;
        }
        
        @Override
        public Object getCellEditorValue() {
            return checkBox.getText();
        }
    }


}