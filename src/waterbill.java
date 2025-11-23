public class waterbill {
    public static void main(String[] args){
        int waterUsage = Integer.parseInt(IO.readln("Enter your Water Usage: "));
        int waterBill;

        if (waterUsage < 20){
            waterBill = waterUsage * 500;
        } else if (waterUsage >= 20 && waterUsage < 40){
            waterBill = waterUsage * 700;
        } else {
            waterBill = waterUsage * 1000;
        }

        if (waterBill >= 30000){
            System.out.println("مصرف شما زیاد است");
        } else if (waterBill >= 15000 && waterBill < 30000){
            System.out.println("مصرف شما متوصط است");
        } else {
            System.out.println("مصرف شما کم است");
        }
        System.out.println("مبلغ قبض " + waterBill + " تومان می باشد");
    }
}
