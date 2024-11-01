import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int a,b,c;
     a=sc.nextInt();
     b=sc.nextInt();
     c=sc.nextInt();
     System.out.print(a+b+c+"\n"+(a+b+c)/3+"\n"+((a+b+c)-((a+b+c)/3)));
    }
}