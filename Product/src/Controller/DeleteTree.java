
package Controller;


import Model.Tree;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.ListFlower;
import view.ListFruit;
import view.ListVegetable;


public class DeleteTree {
   
    public void DeleteTree(int index, ArrayList<Tree> list, String nameFile){
        
        FileWriter writer = null;
        try {
            writer = new FileWriter(nameFile);
            for (int i = 0 ; i < list.size(); i++) {
                if(i!= index){
                    Tree tree = list.get(i);
                    writer.write(tree.getName() + "\n" + tree.getProperties() + "\n"+ tree.getPlantTree() + "\n" + tree.getImagePath() + "\n" + tree.getUses()+"\n");
           
                }
            }
            writer.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(DeleteTree.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}