package Controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.Tree;
import java.io.FileWriter;

public class FlowerFile {
    public static ArrayList<Tree> listFlower = new ArrayList<Tree>();
    public static void main(String[] args){
        Tree flower1 = new Tree("Hoa hồng",
            "Cây thân gỗ hoặc bụi thân gai, hoa hồng có nhiều màu sắc và hình dáng khác nhau, ",
            "1. Chọn vị trí và chuẩn bị đất: Chọn vị trí có ánh sáng đầy đủ và đất giàu dinh dưỡng, thông thoáng." +
            "2. Trồng cây: Trồng vào mùa xuân hoặc mùa thu, đảm bảo hố đào đủ lớn và sâu để hỗ trợ hệ thống rễ." +
            "3. Tưới nước: Tưới đều đặn, tránh để đất quá ẩm." +
            "4. Bón phân: Bón phân hữu cơ hoặc phân chứa lân, photpho, kali mỗi 2-4 tuần." +
            "5. Cắt tỉa: Cắt tỉa để tạo hình dáng và kích thích sự ra hoa." +
            "6. Kiểm tra và điều trị sâu bệnh: Theo dõi cây thường xuyên để phát hiện và điều trị sớm sâu bệnh." +
            "7. Thu hoạch hoa: Thu hoạch đều đặn để khuyến khích sự ra hoa liên tục." +
            "8. Bảo vệ mùa đông: Bảo vệ cây khỏi lạnh bằng cách sử dụng lớp phủ bảo vệ.",
            "C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\src\\Image\\images.jpg",
            "Hoa hồng thường được sử dụng để trang trí vườn, làm hoa cắt cắm và có giá trị trong ngành công nghiệp mỹ phẩm và hương liệu.");
        Tree flower2 = new Tree("Hoa tulip",
             "Cây thân cỏ thuộc họ Liliaceae, hoa Tulip có hình dáng cổ điển với 6 cánh hoa hình cánh bướm, thường được trồng thành các bông hoa lẻ hoặc nhóm. Có đa dạng màu sắc, từ các màu đậm và rực rỡ như đỏ, cam, vàng đến các màu nhạt và pastel như trắng, hồng, và tím.",
             "1. Chọn vị trí và chuẩn bị đất: Chọn vị trí có ánh sáng đầy đủ và đất thoát nước tốt." +
            "2 Trồng củ Tulip: Trồng củ vào mùa thu trước khi đất bắt đầu lạnh." +
            "3. Tưới nước: Tưới đủ nước sau khi trồng và tránh tưới quá nhiều khi củ đang ở trong giai đoạn nằm yên." +
            "4. Bón phân: Bón phân hữu cơ hoặc phân hoa vào mùa xuân khi mầm mọc ra." +
            "5. Giữ ẩm đất: Giữ đất ẩm nhưng không ngập nước để khuyến khích sự phát triển của hoa." +
            "6. Cắt tỉa: Cắt tỉa hoa sau khi hoa đã tàn để giữ cho cây đẹp mắt." + 
            "7. Thu hoạch hoa: Thu hoạch hoa khi chúng đạt đến độ rộng tối đa và chúng bắt đầu mở." +
            "8. Bảo vệ mùa đông: Nếu bạn sống ở vùng có khí hậu lạnh, hãy bảo vệ củ Tulip khỏi sương lạnh và tuyết bằng cách sử dụng lớp phủ bảo vệ.",
            "C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\src\\Image\\nguon-goc-va-y-nghia-hoa-tulip-theo-tung-mau-sac-khac-nhau-202112012337117668.jpg",
            "Hoa tulip thường được trồng trong vườn hoa, làm hoa cắt cắm và được sử dụng làm điểm nhấn trang trí trong công viên và khu vườn công cộng."
        );
        Tree flower3 = new Tree("Hoa cẩm tú cầu",
            "Có hình dạng phẳng, giống như đĩa, với nhiều lớp cánh hoa. Cánh hoa có thể có nhiều màu sắc khác nhau như đỏ, hồng, cam, vàng, trắng và tím. Tolerant với nhiều loại đất và thời tiết, dễ chăm sóc và trồng, cần ánh sáng đầy đủ và nước ổn định.",
            "1. Chọn vị trí và chuẩn bị đất: Chọn vị trí có ánh sáng đầy đủ và đất thông thoáng." +
            "2. Trồng hạt hoặc cây giống: Trồng hạt hoặc cây giống vào mùa xuân sau khi nguyên đất đã ấm lên." +
            "3. Tưới nước đều đặn: Tưới nước khi đất khô, nhưng tránh để đất ngập nước." +
            "4. Bón phân: Bón phân hữu cơ hoặc phân hoa mỗi 4-6 tuần để tăng cường sự phát triển của cây và hoa." +
            "5. Cắt tỉa: Cắt tỉa hoa và lá cũ để thúc đẩy sự ra hoa và giữ cho cây mọc đều đặn." +
            "6. Kiểm tra sâu bệnh: Theo dõi và kiểm tra cây thường xuyên để phát hiện sớm sự xuất hiện của sâu bệnh và điều trị kịp thời." +
            "7. Thu hoạch hoa: Thu hoạch hoa khi chúng đã đạt đến độ rộng tối đa và bắt đầu mở ra." +
            "8. Bảo vệ mùa đông (nếu cần): Bảo vệ cây khỏi lạnh bằng cách sử dụng lớp phủ bảo vệ, đặc biệt ở những khu vực có khí hậu lạnh.",
            "C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\src\\Image\\vuon-hoa-cam-tu-cau-1_1690127172.jpg",
            "Thường được sử dụng trong việc trang trí vườn, hòn non bộ, hoa cắt cắm và làm hoa trang trí trong các sự kiện."
        );
        
        listFlower.add(flower1);
        listFlower.add(flower2);
        listFlower.add(flower3);
        String filePath = "C:\\Users\\thamb\\Java\\ProPlantGuard\\Product\\FLOWER.txt";
        FileWriter writer = null;
        try {
            writer = new FileWriter(filePath,true);
              for (Tree tree : listFlower) {
                writer.write(tree.getName() + "\n" + tree.getProperties() + "\n"+ tree.getPlantTree() + "\n" + tree.getImagePath() + "\n" + tree.getUses()+"\n");
            }
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(FlowerFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
