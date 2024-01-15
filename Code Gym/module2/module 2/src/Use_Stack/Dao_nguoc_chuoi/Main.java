package Use_Stack.Dao_nguoc_chuoi;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        System.out.println("Nhập vào chuỗi: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i) + " ");
        }
        System.out.println("Chuỗi đảo ngược: ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(stack.pop()+ " ");
        }
    }
}
