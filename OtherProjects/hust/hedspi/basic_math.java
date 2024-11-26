import java.util.Scanner;

public class basic_math {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hay nhap 2 so: ");
        
        double so1 = input.nextDouble();
        double so2 = input.nextDouble();

        double tong = so1 + so2;
        double hieu = so1 - so2;
        double tich = so1 * so2;

        double thuong;
        if (so2 != 0) {
            thuong = so1 / so2;
        } else {
            System.out.println("Khong the chia cho 0.");
            thuong = Double.NaN;
        }

        System.out.println("Tong: " + tong);
        System.out.println("Hieu: " + hieu);
        System.out.println("Tich: " + tich);
        if (!Double.isNaN(thuong)) {
            System.out.println("Thuong: " + thuong);
        }

        input.close();
    }
}
