import java.util.Scanner;


public class solving_equation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Chon chuong trinh: ");
        System.out.println("1: ax+b=0");
        System.out.println("2: he phuong trinh bac nhat 2 an");
        System.out.println("3: phuong trinh bac 2");

        int program = input.nextInt();
        switch (program) {
            case 1:
                equation1();
                break;
            case 2:
                equation2();
                break;
            case 3:
                equation3();
                break;
            default:
                break;
        }
        input.close();
    }
    public static void equation1() {
        Scanner input = new Scanner(System.in);

        System.out.println("nhap a: ");
        double a = input.nextDouble();

        System.out.println("nhap b: ");
        double b = input.nextDouble();
        if(a==0) {
            if (b!=0) {
                System.out.println("vo nghiem");
            }
            else {
                System.out.println("vo so nghiem");
            }
        } else {
            System.out.println("x = " + (b/a));
        }
        input.close();
    }
    public static void equation2() {
        Scanner input = new Scanner(System.in);

        System.out.println("a1x1 + b1x2 = c1");
        System.out.println("a2x1 + b2x2 = c2");

        System.out.println("nhap a1: ");
        double a1 = input.nextDouble();
        System.out.println("nhap b1: ");
        double b1 = input.nextDouble();
        System.out.println("nhap c1: ");
        double c1 = input.nextDouble();
        System.out.println("nhap a2: ");
        double a2 = input.nextDouble();
        System.out.println("nhap b2: ");
        double b2 = input.nextDouble();
        System.out.println("nhap c2: ");
        double c2 = input.nextDouble();

        double d = a1*b2 - a2*b1;
        double d1 = c1*b2 - c2*b1;
        double d2 = a1*c2 - a2*c1;

        double x = d1/d;
        double y = d2/d;

        System.out.println("x1 = " + x);
        System.out.println("x2 = " + y);
        
        input.close();
    }
    public static void equation3() {
        Scanner input = new Scanner(System.in);

        System.out.println("ax^2 + bx +c = 0");
        System.out.println("nhap a: ");
        double a = input.nextDouble();
        System.out.println("nhap b: ");
        double b = input.nextDouble();
        System.out.println("nhap c: ");
        double c = input.nextDouble();

        double delta = b*b - 4*a*c;
        if (delta < 0) {
            System.out.println("vo nghiem");
        } else if (delta == 0) {
            System.out.println("x = " + (0-b/2/a));
        } else {
            double x1 = (-b+Math.sqrt(delta)) / (2*a);
            double x2 = (-b-Math.sqrt(delta)) / (2*a);
            
            System.out.println("nghiem x1 = " + x1);
            System.out.println("nghiem x2 = " + x2);
        }
        input.close();
    }
}
