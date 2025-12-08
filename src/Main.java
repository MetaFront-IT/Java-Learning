import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("۱:جمع");
            System.out.println("۲:تفریق");
            System.out.println("۳:ضرب");
            System.out.println("۴:تقسیم");
            System.out.println("۵:توان مثبت");
            System.out.println("۶:خروج");
            System.out.println("یکی از اعداد را وارد کنید: ");
            float num1;
            float num2;
            float result;
            short operation = input.nextShort();

            if (operation == 5) {
                System.out.println("عدد را وارد کنید:");
                num1 = input.nextFloat();
                System.out.println("ریشه چند؟");
                num2 = input.nextFloat();
                result = num1;
                for (int i = 1; i != num2; i++) {
                    result = result * num1;
                }
                System.out.println(result);
            } else if (operation == 6) {
                break;
            } else {
                System.out.println("عدد اول را وارد کنید: ");
                num1 = input.nextFloat();
                System.out.println("عدد دوم را وارد کنید: ");
                num2 = input.nextFloat();
                if (operation == 1) {
                    result = num1 + num2;
                    System.out.println(result);
                } else if (operation == 2) {
                    result = num1 - num2;
                    System.out.println(result);
                } else if (operation == 3) {
                    result = num1 * num2;
                    System.out.println(result);
                } else if (operation == 4) {
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
