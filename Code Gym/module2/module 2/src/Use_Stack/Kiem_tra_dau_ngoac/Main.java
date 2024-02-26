package Use_Stack.Kiem_tra_dau_ngoac;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> astack = new Stack<>();
        Stack<String> bstack = new Stack<>();
        System.out.print("Nhập vào chuỗi: ");
        String str = sc.nextLine();
        String[] sym = str.split("");
        int dem = 0;
        int count = 0;
        for (int i = 0; i < sym.length; i++) {
            if (sym[i].equals("(")) {
                astack.push(sym[i]);
                count++;
            }
            if (sym[i].equals(")")) {
                bstack.push(sym[i]);
                dem++;
            }
        }
        if (astack.isEmpty()) {
            System.out.println("Không có dấu ngoặc! ");
        }
        if (dem == count) {
            System.out.println("Well");
        } else {
            System.out.println("???");
        }
    }
}
