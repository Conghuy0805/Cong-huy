package CaseStudy_Module2.repository;

import CaseStudy_Module2.model.Employee;
import CaseStudy_Module2.util.EmployeeReadFile;
import CaseStudy_Module2.util.EmployeeWriteFile;

import java.util.ArrayList;

public class EmployeeRepository implements IEmployeeRepository {
    static int size;

    @Override
    public ArrayList<Employee> readfile() {
        return EmployeeReadFile.ReadFile();
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public ArrayList<Employee> writeFile(ArrayList<Employee> employees) {
        return EmployeeWriteFile.WriteFile(employees);
    }
}
