import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      
      if(n == 0 || n < 0){
        System.out.print("0");
      }
      
      int a = 0;
      int b = 1;
      
      System.out.println("0, 1");
      
      int sum = 0;
      for(int i = 2; i <= n; i++){
        sum = a + b;
        System.out.println(", "+sum);
        a = b;
        b = sum;
      }
      
      
  }
}