import java.util.Scanner;
abstract class Lab7A_1{
    public static void main(String[]args){
       vegetable v1;
        v1 = new potato();
        v1.printDetails("Brown");
        vegetable v2;
        v2= new tomato();
        v2.printDetails("purple");
        vegetable v3;
        v3 = new Brinjal();
        v3.printDetails("Red");
    }
}
abstract class vegetable{
    String color;
    abstract void printDetails(String color);
    }
class potato extends vegetable{
    
    void printDetails(String color){
        System.out.println(" color of potato is: "+color);
    }
}
class Brinjal extends vegetable{
    void printDetails(String color){
        System.out.println(" color of potato is: "+color);
    }
}
class tomato extends vegetable{
    void printDetails(String color){
        System.out.println(" color of potato is: "+color);
    }
}