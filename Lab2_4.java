import java.util.Scanner;
public class Lab2_4{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle :");
        double R = sc.nextInt();
        double Ans = 3.14*R*R;
        System.out.println("the area of circle with radius "+R+"is : "+Ans);
    }
}