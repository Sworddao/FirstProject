//public class AreaCircle {
//    public static void main(String[] args) {
//
//        int r = 4;
//        float pi = 3.14f;
//        float area = pi * r * r;
//        System.out.println(area);
//    }
//}

import  java.util.Scanner;
public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double r = sc.nextDouble();
        double area = Math.PI * r * r;
        System.out.println("The area of the circle is " + area);
    }
}