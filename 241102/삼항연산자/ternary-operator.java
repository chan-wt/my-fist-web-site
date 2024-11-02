import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    String k;
    n=sc.nextInt();
    k=(n==100) ?"pass":"failure";
    System.out.print(k);
    }
}