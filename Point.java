import java.io.Console;
import java.util.Scanner;

class Point {
    private double x;
    private double y;

    public Point (double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public void setX(double x)
    {
        this.x = x;
    }
    public double getX()
    {
        return x;
    }
    public void setY(double y)
    {
        this.y = y;
    }
    public double getY()
    {
        return y;
    }
    public static void ktra(Point A, Point B, Point C) {
        if((C.y-A.y)/(C.x - A.x) == (B.y - A.y) / (B.x - A.x)){
            System.out.println("3 diem A,B,C thang hang");
            System.out.println("Khoang cach A den B: " + distance(A,B));
            System.out.println("Khoang cach B den C: " + distance(B,C));
            System.out.println("Khoang cach A den C: " + distance(A,C));
        }
        else{
            double x = distance(A,B);
            double y = distance(B,C);
            double z = distance(A,C);
            System.out.println("3 diem ko thang hang");
            System.out.println("Khoang cach A den B: " + x);
            System.out.println("Khoang cach B den C: " + y);
            System.out.println("Khoang cach A den C: " + z);

            double c = x + y + z;
            System.out.println("Chu vi = " + c);   
            double p = c / 2;
            double s = Math.sqrt((p)*(p - x) * (p - y) * (p - z));
            System.out.println("Dien tich = " + s); 
        }
    }
    public static double distance(Point A, Point B){
        double distr;
        distr = Math.sqrt((A.x - B.x) *(A.x - B.x) +(A.y - B.y) *(A.y - B.y));
        return distr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap toa do diem A: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("Nhap toa do diem B: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.println("Nhap toa do diem C: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        Point P1 = new Point(x1, y1);
        Point P2 = new Point(x2, y2);
        Point P3 = new Point(x3, y3);
        ktra(P1, P2, P3);
    }
}
