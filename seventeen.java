import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      
      Engine(n, n, 1);  
  }
  
  public static void Engine(int n, int i, int fact){
    
    if(i == 1){
      fact *= i;
      System.out.println(fact);
      return;
    }
    
    fact *= i;
    Engine(n , i - 1, fact);
  }
}