import java.util.*;

public class firstClass {
    public static void calculateSum(int a , int b){
        
        int sum = a + b;
        System.out.print("output is :"  + sum ) ;
    }
    public static void main( String args[] ){
       Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
       calculateSum(a,b);
    }
}