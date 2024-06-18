import java.util.*;
public class Lab5_6{
     static int count=0;
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the radius of circle:");
      double radius = sc.nextDouble();
      System.out.println("Enter the length of rectangle:");
      int length = sc.nextInt();
      System.out.println("Enter the bredth of rectengle:");
      int breadth = sc.nextInt();
      Area areaofcircle = new Area(radius);
      Area areaofrectangle = new Area(length,breadth);
      System.out.println("The count is:");
      System.out.println(count);

    }
    static class Area{
        double ans;
        Area( double radius){
            ans = 3.14*radius*radius;
            System.out.println(ans);
            count++;
        }
        Area(int length, int breadth){
            ans = length*breadth;
            count++;
            System.out.println(ans);
        }

    }
}