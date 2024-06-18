import java.util.Scanner;
public class Lab2_5{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temprature in farenheit : ");
        double F = sc.nextDouble();
        double Ans = ((F-32)*5)/9;
        System.out.println("The conversion of "+F+"to celcius is : "+Ans);
    }
}