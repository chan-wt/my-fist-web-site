import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h,w;
    int b;
    h=sc.nextInt();
    w=sc.nextInt();
    b=(10000*w)/(h*h);
    System.out.print(b);
    System.out.printf("\n");
    if(b>=25){
        System.out.printf("Obesity");
    }
    }
}