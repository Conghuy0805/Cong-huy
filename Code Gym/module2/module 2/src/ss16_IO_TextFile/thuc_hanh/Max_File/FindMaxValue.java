package ss16_IO_TextFile.thuc_hanh.Max_File;

import java.io.IOException;
import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        List<Integer> numbers = ReadAndWriteFile.readFile("D:\\Code Gym\\module2\\module 2\\src\\ss16_IO_TextFile\\thuc_hanh\\Max_File\\numbers.txt");
        int maxValue = findMax(numbers);
        ReadAndWriteFile.witeFile("D:\\Code Gym\\module2\\module 2\\src\\ss16_IO_TextFile\\thuc_hanh\\Max_File\\numbers.txt", maxValue);
    }
}
