
package Controller;


import Model.Tree;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DeleteTree {
    public void DeleteTree(int index, ArrayList<Tree> list, String nameFile){
        Tree deleteTree = list.get(index);
        list.remove(deleteTree);
        FileWriter writer = null;
        try {
            writer = new FileWriter(nameFile);
              for (Tree tree : list) {
                writer.write(tree.getName() + "\n" + tree.getProperties() + "\n"+ tree.getPlantTree() + "\n" + tree.getImagePath() + "\n" + tree.getUses()+"\n");
            }
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(DeleteTree.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
