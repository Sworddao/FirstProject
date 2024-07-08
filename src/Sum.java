//public class Sum {
//    public static void main(String[] args) {
//
//        int a = 4;
//        int b =4;
//        sum = a+b;
//        System.out.println(sum);
//
//    }
//}

import  java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter another number: ");
        int b = sc.nextInt();
         int sum = a+b;
        System.out.println(" The sum of two numbers is: " + sum);
        sc.close();
    }
}