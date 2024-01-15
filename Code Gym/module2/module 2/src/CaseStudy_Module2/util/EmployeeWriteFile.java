package CaseStudy_Module2.util;

import CaseStudy_Module2.model.Employee;

import java.io.*;
import java.util.ArrayList;

public class EmployeeWriteFile {
    private static final String FILE_PATH = "D:\\Code Gym\\module2\\module 2\\src\\CaseStudy_Module2\\data\\Employee.csv";

    public static ArrayList<Employee> WriteFile(ArrayList<Employee> employees) {
        File file = new File(FILE_PATH);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee ch : employees) {
                bufferedWriter.write(ch.getMaNhanVien() + "," + ch.getHoVTen() + "," + ch.getNgaySinh() + "," + ch.getGioiTinh() + "," + ch.getSoCMND() + "," + ch.getSoDT() + "," + ch.geteMail() + "," + ch.getTrinhDo() + "," + ch.getViTri() + "," + ch.getLuong());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return employees;
    }
}
