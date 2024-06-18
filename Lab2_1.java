import java.util.Scanner;
public class Lab2_1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number:");
        int N1 = sc.nextInt();
        System.out.println("Enter second number:");
        int N2 = sc.nextInt();
        int Ans = N1 + N2;
        System.out.println("the sum of"+N1+"and"+N2+"is:"+Ans);
    }
}
