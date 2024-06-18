import java.util.*;
public class Lab3_4{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. u want to check : ");
        int A = sc.nextInt();
        int ans = 0;
        for(int i=2 ; i<=A-1 ; i++){
            if(A%i==0){
                ans = ans+1;
            }
        }
        if(ans==0){
             System.out.println("The given no. is prime.");
        }
        else{
             System.out.println("The given no. is not prime.");
        }
        }
    }