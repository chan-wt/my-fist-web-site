import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in); 
   int a;
   a=sc.nextInt();
   if(a>=100){
    System.out.print("vapor");
   }
   else if(a>=0){
    System.out.print("water");
   }
   else{
    System.out.print("ice");
   }
    }
}