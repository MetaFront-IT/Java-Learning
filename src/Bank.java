public class Bank {
    public static void main(String[] args){
        System.out.println("1.موجودی حساب");
        System.out.println("2.برداشت پول");
        System.out.println("3.واریز به حساب");
        System.out.println("4.خروج");
        boolean Working = true;
        int accountBalance = 100000;
        String Currency = "تومان";
        while (Working){
            int Operation = Integer.parseInt(IO.readln("یکی ار اعداد را وارد کنید: "));

            if (Operation == 1) {
                System.out.println(accountBalance + " " + Currency);
            } else if (Operation == 2) {
                int Withdrawal = Integer.parseInt(IO.readln("لطفا مقدار را وارد کنید: "));
                if (accountBalance > Withdrawal) {
                    accountBalance -= Withdrawal;
                    System.out.println("برداشت موفق");
                } else {
                    System.out.println("موجودی حساب کافی نیست");
                }
            } else if (Operation == 3) {
                int Deposit = Integer.parseInt(IO.readln("لطفا مقدار را وارد کنید"));
                accountBalance +=  Deposit;
                System.out.println("واریز موفق");
            } else if (Operation == 4) {
                System.out.println("خروج");
                Working = false;
            } else {
                System.out.println("گذینه نا معتبر است");
            }
        }
    }
}
