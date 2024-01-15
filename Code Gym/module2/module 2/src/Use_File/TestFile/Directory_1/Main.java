package Use_File.TestFile.Directory_1;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Kiểm tra thư mục hoặc tập tin có tồn tại không?
        File folder1 = new File("D:\\Code Gym\\module2\\module 2\\src\\Use_File");
        File folder2 = new File("D:\\Code Gym\\module2\\module 2\\src\\Use_File1");
        System.out.println("Kiểm tra folder1 có tồn tại hay không: " + folder1.exists());
        System.out.println("Kiểm tra folder2 có tồn tại hay không: " + folder2.exists());

        // Tạo thư mục
        // Phương thức mkdir() => Tạo 1 thư mục
        File d1 = new File("D:\\Code Gym\\module2\\module 2\\src\\Use_File\\Directory_1");
        d1.mkdir();

        // Phương thức mkdirs() => Tạo nhiều thư mục cùng lúc
        File d2 = new File("D:\\Code Gym\\module2\\module 2\\src\\Use_File\\Directory_1\\Directory_2");
        d2.mkdirs();

        // Tạo tập tin (có phần mở rộng: .exe, .txt, .doc, .xls,.....)
        File file1 = new File("D:\\Code Gym\\module2\\module 2\\src\\Use_File\\Directory_1\\Vidu1.txt");
        File file2 = new File("D:\\Code Gym\\module2\\module 2\\src\\Use_File\\Directory_1\\Vidu2.txt");
        try {
            file1.createNewFile();
            file2.createNewFile();
        } catch (IOException e) {
            // Không có quyền tạo tập tin
            // Ổ cứng bị đầy
            // Đường dẫn sai
            throw new RuntimeException(e);
        }
    }
}
