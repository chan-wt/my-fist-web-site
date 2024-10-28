import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        int m,d,y;
        m=sc.nextInt();
        d=sc.nextInt();
        y=sc.nextInt();
        System.out.print(y+"."+m+"."+d);
    }
}