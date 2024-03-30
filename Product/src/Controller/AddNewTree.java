/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Tree;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.ListFlower;

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
