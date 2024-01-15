package Use_File.Delete;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void xoaFile(File fx) {
        if (fx.isFile()) {
            // Xóa nếu là tập tin
            System.out.println("Đã xóa:" + fx.getAbsoluteFile());
            fx.delete();
        } else if (fx.isDirectory()) {
            // Lấy các file con
            File[] mangCon = fx.listFiles();
            for (File file : mangCon) {
                // Xóa các file con
                xoaFile(file);
            }
            // Xóa bản thân thư mục sau khi đã xóa các file con
            System.out.println("Đã xóa:" + fx.getAbsoluteFile());
            fx.delete();
        }
    }

    public static void main(String[] args) {
        // Sử dụng class File xóa tập tin hoặc thư mục
        File f0 = new File("D:\\Code Gym\\module2\\module 2\\src\\Use_File\\Delete\\FF\\F0");
        File f0_1 = new File("D:\\Code Gym\\module2\\module 2\\src\\Use_File\\Delete\\FF\\F0\\F1");
        File f_vidu = new File("D:\\Code Gym\\module2\\module 2\\src\\Use_File\\Delete\\FF\\F0\\F2");

        /*
        f0.deleteOnExit(); // Xóa không được vì có chứa thư mục và tập tin
        f0_1.deleteOnExit(); // Xóa được vì là thư mục rỗng
        f_vidu.deleteOnExit(); // Xóa được vì là tập tin
        System.out.println(f0_1.delete());

        Main.xoaFile(f0);
         */

        // Sử dụng class Files xóa tập tin và thư mục
        Path p0 = f0.toPath();
        Path p0_1 = f0_1.toPath();
        Path p_vidu = f_vidu.toPath();
        try {
//            Files.deleteIfExists(p0);
            Files.deleteIfExists(p0_1);
            Files.deleteIfExists(p_vidu);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
