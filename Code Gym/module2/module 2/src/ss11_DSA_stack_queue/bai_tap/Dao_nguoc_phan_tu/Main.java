package ss11_DSA_stack_queue.bai_tap.Dao_nguoc_phan_tu;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            stack.push(i);
        }
        System.out.println("Mảng ban đầu: " + stack);
        System.out.print("Mảng sau khi đảo ngược: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println("\n");

        Stack<String> wstack = new Stack<>();
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();
        String[] word = str.split("");
        for (int i = 0; i < word.length; i++) {
            wstack.push(word[i]);
        }
        System.out.print("Chuỗi sau khi đảo ngược: ");
        while (!wstack.isEmpty()) {
            System.out.print(wstack.pop() + " ");
        }
    }
}
