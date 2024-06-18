import java.util.Scanner;
public class Lab5_2{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the time in hours");
    int T1=sc.nextInt();
    System.out.println("Enter the time in minutes");
    int T2=sc.nextInt();
    System.out.println("Enter the time in seconds");
    int T3=sc.nextInt();
    Time ans = new Time(T1,T2,T3);
    
}
}
class Time{
    int h,m,s;
    Time()
    {
        h=10;
        m=15;
    }
    Time(int hr,int min,int sec){
        h=hr;
        m=min;
        s=sec;
        if(h>24)
        {
            h=1;
        }
        if(m>59)
        {
            h++;
        }
        if(s>59)
        {
            m++;
        }
        System.out.println("The time is hr: "+h+" m: "+m+" s: "+sec);
    }
}
