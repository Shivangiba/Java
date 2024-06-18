import java.util.Scanner;
public class Lab2_3{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter '+' for addition, '-' for substraction, '*' for multiplication and '/' for division : ");
        String str = sc.next();
        System.out.println("Enter 1st number :");
        int A = sc.nextInt();
        System.out.println("Enter 2nd number :");
        int B = sc.nextInt();
        int ans=0;
        switch(str){
        case "+":{
             
         System.out.println("Addition : "+(A+B));   
        

        }
        break;
       
        case "-":
        {
         System.out.println("Substraction : "+(A-B)); 
        }
        break;
        case "*" :
        {
         System.out.println("Multiplication : "+(A*B)); 
        }
        break;
        case "/" :
        {
            while(B==0){
                System.out.println("enter valid b:");
                B = sc.nextInt();
            }
        System.out.println("Division : "+(A/B)); 
        }
        break;
        default: {
            System.out.println("Enter valid operation");
            
        }
        }
    }
}