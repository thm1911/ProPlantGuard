
package Controller;

import Model.Tree;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FruitFile {
    public static void main(String[] args) {
        Tree fruit1 = new Tree("Dâu tây",
                " Dâu tây thường có hình dạng tròn hoặc hình trái tim, có màu đỏ sáng và bề mặt có những chấm đen nhỏ. Dâu tây có vị ngọt, hơi chua, và có mùi thơm đặc trưng. Trong dâu tây, có các hạt nhỏ nhưng cứng, được bao quanh bởi thịt dâu mềm, giàu vitamin C, chất chống oxy hóa, axit folic và kali.",
                "1. Chuẩn bị đất: Loại bỏ cỏ dại và các vật liệu cặn bã khác, phân bón đất để cải thiện độ dẻo của đất." +
                "2. Chọn giống: Chọn giống dâu tây phù hợp với điều kiện khí hậu và đất đai tại vị trí trồng." +
                "3. Gieo hạt hoặc trồng cây giâm cành: Chọn phương pháp trồng hợp lý, có thể là gieo hạt hoặc trồng cây giâm cành từ cây mẹ." +
                "4. Chăm sóc cây non: Tưới nước đều đặn và bón phân để giúp cây phát triển khỏe mạnh." +
                "5.Chăm sóc sau thu hoạch: Sau khi thu hoạch, loại bỏ các cây cũ yếu kém và chăm sóc cây mới để chuẩn bị cho vụ mùa sau." +
                "6. Bảo dưỡng đất: Theo dõi và bổ sung dinh dưỡng cho đất khi cần thiết để đảm bảo sự phát triển của cây." +
                "7. Thu hoạch: Thu hoạch dâu tây khi chúng đã chín đỏ và có vị ngọt.",
                "C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\src\\Image\\maxresdefault.jpg",
                "Dâu tây thường được sử dụng tươi, làm mứt, làm sinh tố, hoặc là thành phần trong nhiều món tráng miệng và món ăn khác."
        );
        Tree fruit2 = new Tree("Xoài",
                "Xoài có hình dạng tròn hoặc oval, thường có một mặt phẳng và một mặt hơi lồi. Vỏ của xoài có thể màu vàng, cam, đỏ hoặc xanh lá cây, tùy thuộc vào loại. Xoài chứa nhiều vitamin và khoáng chất, đặc biệt là vitamin C và A, kali và chất xơ.",
                "1. Chuẩn bị đất: Làm sạch vùng đất trồng bằng cách loại bỏ cỏ dại và các vật liệu không mong muốn khác. Phân bón đất để cải thiện độ dẻo và dinh dưỡng của đất." +
                "2. Chọn giống: Chọn giống xoài phù hợp với điều kiện khí hậu và đất đai của khu vực trồng." +
                "3. Chăm sóc cây non: Tưới nước đều đặn và bón phân để giúp cây non phát triển mạnh mẽ." +
                "4. Chăm sóc sau thu hoạch: Loại bỏ các cây xoài cũ yếu kém và chăm sóc các cây trẻ mới để chuẩn bị cho mùa trồng tiếp theo." +
                "5. Bảo dưỡng đất: Theo dõi và bổ sung dinh dưỡng cho đất khi cần thiết để đảm bảo sự phát triển của cây." +
                "6. Chăm sóc đặc biệt: Cung cấp bón phân và nước đặc biệt trong giai đoạn đặc biệt như giai đoạn ra hoa, đậu trái và phát triển trái." +
                "7. Thu hoạch: Thu hoạch xoài khi chúng đã chín đỏ và có mùi thơm đặc trưng. Đối với một số loại, cần chờ đến khi chúng rụng tự nhiên từ cây.",
                "C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\src\\Image\\tu-vu-be-9-tuoi-suyt-chet-vi-an-xoai-chuyen-gia-canh-bao-khong-an-xoai-neu-co-dau-hieu-sau.jpg",
                "Xoài được ăn tươi, làm thành phẩm như mứt, sinh tố, nước ép và được sử dụng trong nhiều món ăn và đồ uống khác."
        );
        Tree fruit3 = new Tree("Sầu riêng",
                "Quả sầu riêng có hình tròn hoặc hình chóp dẹt, có màu xanh lục hoặc xanh đậm nếu chưa chín và màu vàng hoặc xanh nhạt khi chín. Sầu riêng có hương thơm đặc trưng và vị ngọt đậm đà, chứa nhiều vitamin C, B và khoáng chất như kali và magiê.",
                "1. Chuẩn bị đất: Làm sạch và phân bón đất để cải thiện độ dẻo và dinh dưỡng của đất. Đảm bảo đất thoát nước tốt và có độ pH phù hợp." +
                "2. Chọn giống: Chọn giống sầu riêng phù hợp với điều kiện khí hậu và đất đai của khu vực trồng." +
                "3. Gieo hạt hoặc trồng cây giâm cành: Chọn phương pháp trồng hợp lý, có thể là gieo hạt hoặc trồng cây giâm cành từ cây mẹ."+
                "4. Chăm sóc cây non: Tưới nước đều đặn và bón phân để giúp cây non phát triển mạnh mẽ. Bảo vệ cây khỏi côn trùng và bệnh hại." +
                "5.Chăm sóc sau thu hoạch: Loại bỏ các cây sầu riêng cũ yếu kém và chăm sóc các cây trẻ mới để chuẩn bị cho mùa trồng tiếp theo." +
                "6. Bảo dưỡng đất: Theo dõi và bổ sung dinh dưỡng cho đất khi cần thiết để đảm bảo sự phát triển của cây." +
                "7. Chăm sóc đặc biệt: Cung cấp bón phân và nước đặc biệt trong giai đoạn đặc biệt như giai đoạn ra hoa, đậu trái và phát triển trái." +
                "Thu hoạch: Thu hoạch sầu riêng khi chúng đã chín màu và có vị thơm đặc trưng. Đối với một số loại, cần chờ đến khi chúng rụng tự nhiên từ cây.",
                "C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\src\\Image\\sau-rieng-top-1002.jpg",
                "Sầu riêng thường được ăn trực tiếp, làm sinh tố, hoặc chế biến thành đồ ăn và đồ uống truyền thống."
        );
        ArrayList<Tree> listFruit = new ArrayList<Tree>();
        listFruit.add(fruit1);
        listFruit.add(fruit2);
        listFruit.add(fruit3);
        try {
            FileOutputStream fos = new FileOutputStream("FRUIT.DAT");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listFruit);
            
            oos.close();
            fos.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FruitFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FruitFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
             
    }
}
