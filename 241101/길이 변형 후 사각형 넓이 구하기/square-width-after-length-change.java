import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int a,b;
    a=sc.nextInt();
    b=sc.nextInt();
    a+=8;  //a=a+8
    b*=3; //b=b*3
    System.out.print(a+"\n"+b+"\n"+(a*b));
    }
}