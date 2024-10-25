public class Main {
    public static void main(String[] args) {
    int a=3;
    int b=5;
    int temp;  //선언 후 초기화 필요
    temp=a;
    a=b;
    b=temp;
    System.out.print(a+"\n"+b);
       }
}