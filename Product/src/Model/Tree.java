
package Model;
import com.sun.jdi.AbsentInformationException;
import java.io.Serializable;
import javax.swing.JTable;

public class Tree{
    public Tree(){
        
    }

    public Tree(String name, String properties, String plantTree, String imagePath, String uses) {
        this.name = name;
        this.properties = properties;
        this.plantTree = plantTree;
        this.imagePath = imagePath;
        this.uses = uses;
    }
    
    private String name, properties, plantTree, imagePath, uses;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setProperties(String properties){
        this.properties = properties;
    }
    public String getProperties(){
        return properties;
    }
    public void setPlantTrees(String plantTree){
       this.plantTree = plantTree;
    }
    public String getPlantTree(){
        return plantTree;
    }
    public void setImagePath(String imagePath){
        this.imagePath = imagePath;
    }
    public String getImagePath(){
        return imagePath;
    }
    public void setUses(String uses){
        this.uses = uses;
    }
    public String getUses(){
        return uses;
    }
}
