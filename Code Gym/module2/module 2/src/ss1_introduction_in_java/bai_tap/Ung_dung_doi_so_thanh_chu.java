package ss1_introduction_in_java.bai_tap;

import java.util.Scanner;

public class Ung_dung_doi_so_thanh_chu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.print("Nhập vào số để đọc: ");
            number = Integer.parseInt(sc.nextLine());
            if (number > 999) {
                System.out.print("Số không được lớn hơn 999");
            }
        } while (number > 999);
        String lessTen = one(number);
        String lessTwenty = two(number);
        String twenty = two1(number);
        String lessHundred = oneHundred(number);
        if (number < 10 && number >= 0) {
            System.out.println(lessTen);
        } else if (number < 20 && number >= 10) {
            System.out.println(lessTwenty);
        } else if (number < 100 && number >= 20) {
            System.out.println(twenty);
        } else {
            int tens = (number % 100) / 10;
            int ones = (number % 100) % 10;
            if (tens == 0) {
                String a = one(ones);
                System.out.println(lessHundred + " and " + a);
            } else if (tens == 1) {
                String b = two((number % 10));
                System.out.println(lessHundred + " and " + b);
            } else {
                String c = two1((number % 100));
                System.out.println(lessHundred + " and " + c);
            }
        }
    }

    public static String one(int n) {
        String n1 = Integer.toString(n);
        switch (n) {
            case 0:
                n1 = "";
                break;
            case 1:
                n1 = "one";
                break;
            case 2:
                n1 = "two";
                break;
            case 3:
                n1 = "three";
                break;
            case 4:
                n1 = "four";
                break;
            case 5:
                n1 = "five";
                break;
            case 6:
                n1 = "six";
                break;
            case 7:
                n1 = "seven";
                break;
            case 8:
                n1 = "eight";
                break;
            case 9:
                n1 = "nine";
                break;
            default:
                n1 = "out of ability";
        }
        return n1;
    }

    public static String two(int n) {
        n = n % 10;
        String n1 = Integer.toString(n);
        switch (n) {
            case 0:
                n1 = "ten";
                break;
            case 1:
                n1 = "eleven";
                break;
            case 2:
                n1 = "twelve";
                break;
            case 3:
                n1 = "thirteen";
                break;
            case 4:
                n1 = "fourteen";
                break;
            case 5:
                n1 = "fifteen";
                break;
            case 6:
                n1 = "sixteen";
                break;
            case 7:
                n1 = "seventeen";
                break;
            case 8:
                n1 = "eightteen";
                break;
            case 9:
                n1 = "nineteen";
                break;
        }
        return n1;
    }

    public static String two1(int n) {
        int tens = n / 10;
        int ones = n % 10;
        String ten = Integer.toString(tens);
        String one = Integer.toString(ones);
        switch (tens) {
            case 2:
                ten = "twenty";
                break;
            case 3:
                ten = "thirty";
                break;
            case 4:
                ten = "fourty";
                break;
            case 5:
                ten = "fifty";
                break;
            case 6:
                ten = "sixty";
                break;
            case 7:
                ten = "seventy";
                break;
            case 8:
                ten = "eighty";
                break;
            case 9:
                ten = "ninety";
                break;
        }
        switch (ones) {
            case 1:
                one = "one";
                break;
            case 2:
                one = "two";
                break;
            case 3:
                one = "three";
                break;
            case 4:
                one = "four";
                break;
            case 5:
                one = "five";
                break;
            case 6:
                one = "six";
                break;
            case 7:
                one = "seven";
                break;
            case 8:
                one = "eight";
                break;
            case 9:
                one = "nine";
                break;
            default:
                one = "";
                break;
        }
        return (ten + " " + one);
    }

    public static String oneHundred(int n) {
        n = n / 100;
        String n2 = Integer.toString(n);
        switch (n) {
            case 1:
                n2 = "one hundred";
                break;
            case 2:
                n2 = "two hundred";
                break;
            case 3:
                n2 = "three hundred";
                break;
            case 4:
                n2 = "four hundred";
                break;
            case 5:
                n2 = "five hundred";
                break;
            case 6:
                n2 = "six hundred";
                break;
            case 7:
                n2 = "seven hundred";
                break;
            case 8:
                n2 = "eight hundred";
                break;
            case 9:
                n2 = "nine hundred";
                break;
        }
        return n2;
    }
}
