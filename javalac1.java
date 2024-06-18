import java.util.Scanner;
class box{
    int w;
    int h;
    int b;
    public void Detaset(int width, int height, int breadth);
    w = width;
    b=breadth;
    h=height;

}
public void printvolume(){
    int ans=w*b*h;
    System.out.println("ans = "+ans);
}
