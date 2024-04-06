
package Controller;

import Model.Tree;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddNewTree {
    public void AddNewTree(Tree tree, String nameFile){
        FileWriter writer = null;
        try {
            writer = new FileWriter(nameFile, true);
            writer.write(tree.getName() + "\n");
            writer.write(tree.getProperties() + "\n");
            writer.write(tree.getPlantTree() + "\n");
            writer.write(tree.getImagePath() + "\n");
            writer.write(tree.getUses() + "\n");
            
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(AddNewTree.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}