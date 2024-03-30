
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public void Read() {
        List<Tree> list = new ArrayList<>();
        String filePath = "C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\VEGETABLE.txt";
        FileReader reader = null;
        
        try {
            reader = new FileReader(filePath);
            BufferedReader br= new BufferedReader(reader);
            Tree currentTree = null;
            while(br.ready()==true){
                String name = br.readLine();
                String properties = br.readLine();
                String plantTree = br.readLine();
                String imagePath = br.readLine();
                String uses = br.readLine();
//                    System.out.println(name + properties + plantTree + imagePath + uses);
                currentTree = new Tree(name, properties, plantTree, imagePath, uses);
                list.add(currentTree);
                
            }
            reader.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Tree tree : list) {
            System.out.println(tree);
        }
    }
}
