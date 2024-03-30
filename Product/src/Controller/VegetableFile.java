package Controller;


import Model.Tree;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class VegetableFile {
    public static void main(String[] args) {
        Tree veget1 = new Tree("Súp lơ",
                "Súp lơ thường có hình dạng tròn hoặc hình cầu, với các lá xoắn ốc bao bọc quả. Màu sắc thường là màu xanh nhạt hoặc màu trắng. Súp lơ là một nguồn cung cấp chất xơ, vitamin C, K và các khoáng chất như kali và magiê.",
                "1. Chuẩn bị đất: Làm sạch vùng đất trồng bằng cách loại bỏ cỏ dại và các vật liệu cặn bã. Phân bón đất để cải thiện độ dẻo và dinh dưỡng của đất." +
                "2. Chọn giống: Chọn giống súp lơ phù hợp với điều kiện khí hậu và đất đai của khu vực trồng." +
                "3. Gieo hạt hoặc trồng cây giâm cành: Chọn phương pháp trồng hợp lý, có thể là gieo hạt hoặc trồng cây giâm cành từ cây mẹ." +
                "4. Chăm sóc cây non: Tưới nước đều đặn và bón phân để giúp cây non phát triển mạnh mẽ. Theo dõi và kiểm soát sâu bệnh để bảo vệ cây." +
                "5. Chăm sóc sau thu hoạch: Loại bỏ các cây súp lơ cũ yếu kém và chăm sóc các cây trẻ mới để chuẩn bị cho mùa trồng tiếp theo." +
                ". Bảo dưỡng đất: Theo dõi và bổ sung dinh dưỡng cho đất khi cần thiết để đảm bảo sự phát triển của cây." +
                "7. Chăm sóc đặc biệt: Cung cấp bón phân và nước đặc biệt trong giai đoạn đặc biệt như giai đoạn ra hoa, đậu trái và phát triển trái." +
                "8. Thu hoạch: Thu hoạch súp lơ khi chúng đã đạt kích thước mong muốn và có màu sắc tương đương với giống trồng.",
                "C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\src\\Image\\sup_lo_xanh_sapa.jpg",
                "Súp lơ thường được sử dụng trong nhiều món ăn, bao gồm súp, salad, xào, nướng, và có thể được chế biến thành món ăn chính hoặc món ăn phụ."
        );
        Tree veget2 = new Tree("Cải thảo",
                "Cải thảo có thân thảo hoặc thân mảnh, thường mọc thành từng bụi rậm rạp, lá của cải thảo có hình dạng tròn hoặc hình bầu dục, có thể có răng cưa hoặc không. Cải thảo có hoa màu vàng hoặc trắng, thường mọc thành cụm hoa chùm. Quả của cải thảo là các quả nang dài, chứa hạt.",
                "1. Chuẩn bị đất: Làm sạch và phân bón đất để cải thiện độ dẻo và dinh dưỡng của đất. Loại bỏ cỏ dại và các vật liệu không mong muốn khác." +
                "2. Chọn giống: Chọn giống cải thảo phù hợp với điều kiện khí hậu và đất đai của khu vực trồng. Chọn giống cải thảo có thời gian trưởng phát triển phù hợp với mùa vụ trồng." +
                "3. Gieo hạt hoặc trồng cây giâm cành: Gieo hạt cải thảo trực tiếp vào đất hoặc trồng cây giâm cành từ cây mẹ." +
                "4. Chăm sóc cây non: Tưới nước đều đặn và bón phân để giúp cây non phát triển mạnh mẽ. Đảm bảo cây được ánh sáng đủ và kiểm soát côn trùng hại." +
                "5. Chăm sóc sau thu hoạch: Loại bỏ các cây cải thảo cũ yếu kém và chăm sóc các cây trẻ mới để chuẩn bị cho mùa trồng tiếp theo." +
                "6. Bảo dưỡng đất: Bổ sung phân bón và chất dinh dưỡng cho đất khi cần thiết. Đảm bảo đất thoát nước tốt và có độ pH phù hợp." +
                "7. Chăm sóc đặc biệt: Theo dõi và kiểm soát sâu bệnh để bảo vệ cây cải thảo khỏi các loại bệnh và sâu hại." +
                "8. Thu hoạch: Thu hoạch cải thảo khi cây đã đạt kích thước phù hợp và lá cải mềm mịn. Thu hoạch bằng cách cắt từng lá hoặc cắt cả cây tùy thuộc vào mục đích sử dụng.",
                "C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\src\\Image\\tải xuống.jpg",
                "Cải thảo thường được sử dụng trong nhiều món ăn khác nhau, bao gồm súp, xào, nấu canh, hoặc ăn sống trong các salad. Ngoài việc là nguồn cung cấp chất dinh dưỡng, cải thảo còn được sử dụng làm thức ăn cho gia súc và gia cầm. "
        );
        Tree veget3 = new Tree("Rau dền",
                " Rau dền có lá hình mũi tên, có thể có các cạnh lõm và màu sắc thường là màu xanh đậm hoặc tím đậm. Rễ thường mọc sâu vào đất. Rau dền chứa nhiều chất dinh dưỡng như vitamin A, C và K, cũng như axit folic, kali và canxi.",
                "1. Chuẩn bị đất: Làm sạch vùng đất trồng bằng cách loại bỏ cỏ dại và các vật liệu cặn bã. Phân bón đất để cải thiện độ dẻo và dinh dưỡng của đất." +
                "2. Chọn giống: Chọn giống rau dền phù hợp với điều kiện khí hậu và đất đai của khu vực trồng. Chọn giống có thời gian trưởng phát triển phù hợp với mùa vụ trồng." +
                "3. Gieo hạt hoặc trồng cây giâm cành: Gieo hạt rau dền trực tiếp vào đất hoặc trồng cây giâm cành từ cây mẹ." +
                "4. Chăm sóc cây non: Tưới nước đều đặn và bón phân để giúp cây non phát triển mạnh mẽ. Đảm bảo cây được ánh sáng đủ và kiểm soát côn trùng hại." +
                "5. Chăm sóc sau thu hoạch: Loại bỏ các cây rau dền cũ yếu kém và chăm sóc các cây trẻ mới để chuẩn bị cho mùa trồng tiếp theo." +
                "6. Bảo dưỡng đất: Bổ sung phân bón và chất dinh dưỡng cho đất khi cần thiết. Đảm bảo đất thoát nước tốt và có độ pH phù hợp." +
                "7. Chăm sóc đặc biệt: Theo dõi và kiểm soát sâu bệnh để bảo vệ cây rau dền khỏi các loại bệnh và sâu hại." +
                "8. Thu hoạch: Thu hoạch rau dền khi cây đã đạt kích thước phù hợp và lá rau dền mềm mịn. Thu hoạch bằng cách cắt từng lá hoặc cắt cả cây tùy thuộc vào mục đích sử dụng.",
                "C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\src\\Image\\mang-bau-mua-he-me-nho-an-ngay-mon-rau-chay-ra-cho-la-co-lai-cuc-bo-duong-nay-1-1526956820-134-width600height426-6349.jpg",
                "Rau dền thường được sử dụng trong nhiều món ăn khác nhau, bao gồm nấu canh, xào, hoặc ăn sống trong các salad. Ngoài việc làm thực phẩm, rau dền cũng được sử dụng làm thuốc dân gian để chữa bệnh và cải thiện sức khỏe."
        );
        ArrayList<Tree> listVegetable = new ArrayList<Tree>();
        listVegetable.add(veget1);
        listVegetable.add(veget2);
        listVegetable.add(veget3);
        
        try {
            FileOutputStream fos = new FileOutputStream("VEGETABLE.DAT");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(listVegetable);
            oos.close();
            fos.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VegetableFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VegetableFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                
    }
}
