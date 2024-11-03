import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in); 
   int a;
   int b;
   a=sc.nextInt();
   if(a%2==0){
    a=a/2;
   }
   if(a%2!=0){
    b=(a+1)/2;
    System.out.print(b);
   }
   else{
    System.out.print(a);
   }
    }
}