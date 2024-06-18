public class DemoClockThread{
    public static void main(String[] args){
        PrintAnyString pas1 = new PrintAnyString("Rta");
        pas1.start();
        PrintAnyString pas2 = new PrintAnyString("uv");
        pas2.start();
        
        }
}
        class PrintAnyString extends Thread{
            String collegename;
            public PrintAnyString(String msg){
             collegename=msg; 
            }
            public void run(){
        for(int i=0;i<collegename.length();i++){
            System.out.print(collegename.charAt(i));
            try{
                sleep(100);//waits for 1s after printing one character(in case of 1000)

            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
            }
        }
    
