import java.util.Scanner;
public class rectangleDemo{
public static void main(String[]args){
    
     Rectangle r1 = new Rectangle();
     r1.Rectangle();
}
}
class Rectangle{
    int length;
    int breadth;
    int i;
    public Rectangle(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of rectamgle u want to print : ");
    length  = sc.nextInt();
    System.out.println("Enter the breadth of rectengle you want to print : ");
     breadth = sc.nextInt();
        this.length = length;
        this.breadth = breadth;
    }
    public void Rectangle(){//aa method che constructor nathi constructor ne return type na hoy not even void
        for(i=0;i<breadth;i++){
            for(int j=0;j<=(2*i)-1;j++){
                if(j==0 || j==(2*i)-1||i==0||i==breadth){
               System.out.println(" *");
                }
            }
        }
        System.out.println("This is your desired rectangle.");
    }
}