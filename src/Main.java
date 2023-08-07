import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Số tiền gửi: ");
        int tg = sc.nextInt();
        System.out.print("Lãi suất theo năm: ");
        float ls = sc.nextFloat();
        System.out.print("Số tháng gửi: ");
        float month = sc.nextFloat();

        double total = 0f;
        for (float i = 0; i < month; i++) {
            total += tg * (ls / 100) / 12 * month;
        }
        System.out.println("Số tiền lãi: " + total);
    }
}