import java.util.*;
public class Lab3_3{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.1:");
        Float A = sc.nextFloat();
         System.out.println("Enter no.2:");
        Float B = sc.nextFloat();
         System.out.println("Enter no.3:");
        Float C = sc.nextFloat();
        if(A>B){
            if(A>C) {
                System.out.println("A is Largest.");
            }
            else(C>A) {
                 System.out.println("C is Largest.");
            }
        }
        else{
            if(B>C) {
                 System.out.println("B is Largest.");
            }
            else(C>B) {
                 System.out.println("C is Largest.");
            }
        }
        }
    }