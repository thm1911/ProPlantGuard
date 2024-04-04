
package Controller;
import Model.Tree;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import view.ClassRendered;
import view.Homepage;

public class SearchTree {

    public ArrayList<Tree> list = new ArrayList<>();
    public void ReadFile(String nameFile){
        list.clear();
        FileReader reader = null;
        try {
            reader = new FileReader(nameFile);
            BufferedReader br = new BufferedReader(reader);
            Tree currentTree = null;
            
            while(br.ready() == true){
                String name = br.readLine();
                String properties = br.readLine();
                String plantTree = br.readLine();
                String imagePath = br.readLine();
                String uses = br.readLine();
                currentTree = new Tree(name,properties,plantTree,imagePath,uses);
                list.add(currentTree);
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SearchTree.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SearchTree.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Search(ArrayList<Tree> currentList, DefaultTableModel model , String nameFile, String keyWord, boolean searchByName, boolean searchByKeyWord, JDialog dialog){
        ReadFile(nameFile);
        currentList.addAll(list);
        boolean check = false;
        for(int i = 0; i < list.size(); i++){
            if(searchByName && CompareName(keyWord, list.get(i).getName())){
                check = true;
                Object[] newRow = {list.get(i).getName(),"Chi tiết", i};
                model.addRow(newRow);
            }
            
            if(searchByKeyWord && (CompareKeyWord(keyWord, list.get(i).getProperties())
                    || CompareKeyWord(keyWord, list.get(i).getPlantTree()) 
                    || CompareKeyWord(keyWord, list.get(i).getUses()) )){
                check = true;
                Object[] newRow = {list.get(i).getName(),"Chi tiết", i};
                model.addRow(newRow);
            }
                
        }
        dialog.setSize(204,150);
        dialog.setLocationRelativeTo(null);
        if(check == false) dialog.setVisible(true);
        list.clear();
    }
    
    public boolean CompareName(String s1, String s2){
        String tmp1 = s1.toLowerCase();
        String tmp2 = s2.toLowerCase();
        return tmp1.equals(tmp2);
    }
    
    public boolean CompareKeyWord(String s1, String s2){
        String tmp1 = s1.toLowerCase();
        String tmp2 = s2.toLowerCase();
        return tmp2.contains(tmp1);
    }
}
