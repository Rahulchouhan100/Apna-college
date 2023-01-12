import java.util.*;

public class firstClass {
    public static void calculateSum(){
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int sum = a + b;
        System.out.print("output is :"  + sum ) ;
    }
    public static void main( String args[] ){
       calculateSum();
    }
}