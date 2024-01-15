package CaseStudy_Module2.service;

import CaseStudy_Module2.model.Employee;
import CaseStudy_Module2.repository.EmployeeRepository;
import CaseStudy_Module2.repository.IEmployeeRepository;
import CaseStudy_Module2.util.EmployeeWriteFile;
import CaseStudy_Module2.validation.Validate;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    static Scanner sc = new Scanner(System.in);
    static IEmployeeRepository iEmployeeRepository = new EmployeeRepository();
    static ArrayList<Employee> employees = iEmployeeRepository.readfile();

    @Override
    public void display() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void add() {
        String hoVaten = Validate.hoVaTen();
        System.out.println("Nhập ngày sinh");
        String date = sc.nextLine();
        System.out.println("Nhập giới tính:");
        String gender = sc.nextLine();
        System.out.println("Nhập số CMND:");
        String cnmd = sc.nextLine();
        System.out.println("Nhập số điện thoại: ");
        String sdt = sc.nextLine();
        String email = Validate.email();
        System.out.println("Nhập trình độ:");
        String trinhDo = sc.nextLine();
        System.out.println("Nhập vị trí:");
        String viTri = sc.nextLine();
        System.out.println("Nhập lương:");
        double luong = Double.parseDouble(sc.nextLine());
        Employee employee1 = new Employee(employees.size() + 1, hoVaten, date, gender, cnmd, sdt, email, trinhDo, viTri, luong);
        employees.add(employee1);
        EmployeeWriteFile.WriteFile(employees);
    }

    @Override
    public void edit() {
        System.out.println("Nhập id của employee muốn sửa: ");
        int idFIx = Integer.parseInt(sc.nextLine());
        int choose;
        do {
            System.out.println("Nhập thông tin muốn sửa!!!");
            System.out.println("1. Tên");
            System.out.println("2. Ngày sinh");
            System.out.println("3. Giới tính");
            System.out.println("4. Số CMND");
            System.out.println("5. Số điện thoại");
            System.out.println("6. Email");
            System.out.println("7. Trình độ");
            System.out.println("8. Vị trí");
            System.out.println("9. Lương");
            System.out.println("10. Dừng");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    String nameFix = Validate.hoVaTen();
                    employees.get(idFIx - 1).setHoVTen(nameFix);
                    break;
                case 2:
                    System.out.println("Nhập ngày sinh: ");
                    String dateFix = sc.nextLine();
                    employees.get(idFIx - 1).setNgaySinh(dateFix);
                    break;
                case 3:
                    System.out.println("Nhập giới tính:");
                    String genderFix = sc.nextLine();
                    employees.get(idFIx - 1).setGioiTinh(genderFix);
                    break;
                case 4:
                    System.out.println("Nhập CMND: ");
                    String cmndFix = sc.nextLine();
                    employees.get(idFIx - 1).setSoCMND(cmndFix);
                    break;
                case 5:
                    System.out.println("Nhập số điện thoại: ");
                    String phoneFix = sc.nextLine();
                    employees.get(idFIx - 1).setSoDT(phoneFix);
                    break;
                case 6:
                    String emailFix = Validate.email();
                    employees.get(idFIx - 1).seteMail(emailFix);
                    break;
                case 7:
                    System.out.println("Nhập trình độ: ");
                    String trinhdoFix = sc.nextLine();
                    employees.get(idFIx - 1).setTrinhDo(trinhdoFix);
                    break;
                case 8:
                    System.out.println("Nhập vị trí: ");
                    String vitriFix = sc.nextLine();
                    employees.get(idFIx - 1).setViTri(vitriFix);
                    break;
                case 9:
                    System.out.println("Nhập lương: ");
                    String luongFixString = sc.nextLine();
                    if (!luongFixString.isEmpty()) {
                        double luongFix = Double.parseDouble(luongFixString);
                        employees.get(idFIx - 1).setLuong(luongFix);
                    } else {
                        System.out.println("Giá trị không hợp lệ!");
                    }
                    break;
                default:
                    System.out.println("Danh sách sửa!!!");

            }

        } while (choose >= 1 && choose < 10);
    }
}

















