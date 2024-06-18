import java.util.*;
public class Lab3_1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<6 ; i++){
            System.out.println("Enter the marks of student "+i);
            System.out.println("Enter Marks of Maths :");
            double mathsofi = sc.nextDouble();
            System.out.println("Enter Marks of Science :");
            double Scienceofi = sc.nextDouble();
            System.out.println("Enter Marks of English :");
            double Englishofi = sc.nextDouble();
            System.out.println("Enter Marks of socialscience :");
            double socialscienceofi = sc.nextDouble();
            System.out.println("Enter Marks of computer :");
            double computerofi = sc.nextDouble();
            double Percentage = ((mathsofi + Scienceofi + Englishofi +  socialscienceofi + computerofi)*100)/500;
            System.out.println("The percentage obtained by student"+i+"is : "+Percentage);

             if(Percentage>=60){
                 System.out.println("The student"+i+"belongs to first division.");}
            else if(Percentage>50 && Percentage<=59){
                System.out.println("The student"+i+"belongs to second division.");
            }
            else if(Percentage>40 && Percentage<=49){
                System.out.println("The student"+i+"belongs to second division.");
            }
            else if(Percentage<=40){
                System.out.println("The student"+i+"failed the exam.");
            }
        }
        }
       
    }
