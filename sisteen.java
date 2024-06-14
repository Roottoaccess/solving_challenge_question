// Applying recursion in the problem
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Calling the Method
    int n = sc.nextInt();
    Engine(n , 1 , 0);
  }
  
  public static void Engine(int n,int i,int sum){
    
    if(i == n){
      sum += i;
      System.out.println(sum);
      return;
    }
    
    sum += i;
    /* Using the Recursive Method */
    Engine(n, i + 1, sum);
  }
}