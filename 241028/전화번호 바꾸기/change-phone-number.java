import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    sc.useDelimiter("-");
    int a,b,c;
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    System.out.print("0"+a+"-"+c+"-"+b);
    }
}