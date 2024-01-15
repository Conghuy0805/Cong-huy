package ss16_IO_TextFile.bai_tap.Read_File;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Read_File {
    public static final String FILE_PATH = "D:\\Code Gym\\module2\\module 2\\src\\ss16_IO_TextFile\\bai_tap\\Read_File\\country.csv";

    public static List<Country> readCSV() {
        List<Country> list = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH));
            String line;
            String[] temp;
            Country country;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.isEmpty()) {
                    temp = line.split(",");
                    int id = Integer.parseInt(temp[0]);
                    String language = temp[1];
                    String name = temp[2];

                    country = new Country(id, language, name);
                    list.add(country);
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Country> list = readCSV();
        for (Country country : list) {
            System.out.println(country);
        }
    }
}
