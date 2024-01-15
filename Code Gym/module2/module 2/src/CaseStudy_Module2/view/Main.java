package CaseStudy_Module2.view;

import CaseStudy_Module2.controller.EmployeeController;

public class Main {
    public static void main(String[] args) {
        EmployeeController employeeController = new EmployeeController();
        employeeController.displayMenu();
    }
}
