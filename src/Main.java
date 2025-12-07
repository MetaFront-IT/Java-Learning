import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("۱:جمع");
            System.out.println("۲:تفریق");
            System.out.println("۳:ضرب");
            System.out.println("۴:تقسیم");
            System.out.println("۵:توان");
            System.out.println("۶:خروج");
            System.out.println("یکی از اعداد را وارد کنید: ");
            int num1;
            int num2;
            int result;
            short opreation = input.nextShort();

            if (opreation == 5) {
                System.out.println("عدد را وارد کنید:");
                num1 = input.nextInt();
                result = num1 * num1;
                System.out.println(result);
            } else if (opreation == 6) {
                break;
            } else {
                System.out.println("عدد اول را وارد کنید: ");
                num1 = input.nextInt();
                System.out.println("عدد دوم را وارد کنید: ");
                num2 = input.nextInt();
                if (opreation == 1) {
                    result = num1 + num2;
                    System.out.println(result);
                } else if (opreation == 2) {
                    result = num1 - num2;
                    System.out.println(result);
                } else if (opreation == 3) {
                    result = num1 * num2;
                    System.out.println(result);
                } else if (opreation == 4) {
                    if (num2 == 0) {
                        System.err.println("عدد نا معتبر است");
                    } else {
                        result = num1 / num2;
                        System.out.println(result);
                    }
                } else {
                    System.out.println("عدد نا معتبر است");

                }
            }
        }
    }
}
