package Use_Stack.Dao_nguoc_phan_tu_trong_mang;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.print("Nhập số lượng phần tử: ");
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ [" + i + "] " + ": ");
            arr[i] = Integer.parseInt(sc.nextLine());
            stack.push(arr[i]);
        }
        System.out.println("Mảng ban đầu: " + stack);

        System.out.print("\n" + "Mảng sau khi đảo ngược: ");
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }

    }
}
