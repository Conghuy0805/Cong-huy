package CaseStudy_Module2.util;

import CaseStudy_Module2.model.Employee;

import java.io.*;
import java.util.ArrayList;

public class EmployeeReadFile {
    private static final String FILE_PATH = "D:\\Code Gym\\module2\\module 2\\src\\CaseStudy_Module2\\data\\Employee.csv";
    private static ArrayList<Employee> employees = new ArrayList<>();

    public static ArrayList<Employee> ReadFile() {
        File file = new File(FILE_PATH);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.isEmpty()) {
                    String[] strings = line.split(",");
                    Employee employee = new Employee();
                    employee.setMaNhanVien(Integer.parseInt(strings[0]));
                    employee.setHoVTen(strings[1]);
                    employee.setNgaySinh(strings[2]);
                    employee.setGioiTinh(strings[3]);
                    employee.setSoCMND(strings[4]);
                    employee.setSoDT(strings[5]);
                    employee.seteMail(strings[6]);
                    employee.setTrinhDo(strings[7]);
                    employee.setViTri(strings[8]);
                    employee.setLuong(Double.parseDouble(strings[9]));
                    employees.add(employee);
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException();
        }
        return employees;
    }
}
