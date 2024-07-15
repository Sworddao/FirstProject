//public class RealMain {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
//        }
//    }
//}
//        public class RealMain {
//            public static void main(String[] args) {
//                for (int i = 1; i <= 100; i++) {
//                    if (i % 2 == 0) {
//                        System.out.println(i);
//                    }
//                }
//            }
//        }
//

//public class RealMain {
//            public static void main(String[] args) {
//                for (int i = 1; i <= 100; i++) {
//                    if (i % 2 != 0) {
//                        System.out.println(i);
//                    }
//                }
//            }
//        }

import java.util.Scanner;
public class RealMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Ram");
        }
    }
}




