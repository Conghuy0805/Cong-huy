package ss16_IO_TextFile.bai_tap.Copy_File;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        File sourceFile = new File("D:\\Code Gym\\module2\\module 2\\src\\ss16_IO_TextFile\\bai_tap\\Copy_File\\sourcefile.txt");
        File targetFile = new File("D:\\Code Gym\\module2\\module 2\\src\\ss16_IO_TextFile\\bai_tap\\Copy_File\\target.txt");

        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try {
            fileReader = new FileReader(sourceFile);
            fileWriter = new FileWriter(targetFile);

            int character;
            while ((character = fileReader.read()) != -1) {
                fileWriter.write(character);
            }

            System.out.println("Sao chép tệp tin thành công!");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi trong quá trình sao chép tệp tin: " + e.getMessage());
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.out.println("Đã xảy ra lỗi khi đóng tệp tin: " + e.getMessage());
            }
        }
    }
}