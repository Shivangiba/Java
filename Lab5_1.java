import java.util.Scanner;
public class Lab5_1{
    public static void main(String[]args){
        Area a1=new Area();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius");
        int radius=sc.nextInt();
        double areaOfCircle = a1.circle(radius);
        Area a2=new Area();
        System.out.println("enter length:");
        int l=sc.nextInt();
        double areaOfSquare = a2.square(l);
    }
}
class Area{
    double ans;
    double circle(int r){
        ans=3.14*r*r;
        System.out.println("Area of circle is"+ans);
        return ans;
    }
    double square(int l){
        ans=l*l;
        System.out.println("Area of square is"+ans);
        return ans;
    }
}