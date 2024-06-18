import java.util.Scanner;
public class Lab6A{
    public static void main(String [] args){
        // arg[0],args[1],args[2]
        Book b1;
        if(args[1].equals("book")){
           b1 = new BookPublication(args[0],args[2]); 
        }
        else if(args[1].equals("paper")){
            b1 = new PaperPublication(args[0],args[2]);
        }
        else{
            b1 =  new Book(args[0]);
        }
        b1.printDetails();
    }
}
class Book{
   private String author;
   
   Book(String author){
    this.author = author;
   }

   void printDetails(){
    System.out.println("Author Name : "+this.author);
   }
   
}

class BookPublication extends Book{
    private String title;

    BookPublication(String author,String title){
        super(author);
        this.title = title;
    }

    void printDetails(){
        // System.out.println("Author Name : "+super.author);
        super.printDetails();
        System.out.println("Title : "+this.title);
    }
}

class PaperPublication extends Book{
    private String title;

    PaperPublication(String author,String title){
        super(author);
        this.title = title;
    }   
         void printDetails(){
        // System.out.println("Author Name : "+super.author);
        super.printDetails();
        System.out.println("Title : "+this.title);
    }
}