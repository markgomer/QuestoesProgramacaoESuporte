import java.util.Scanner;

public class Questao2 {
  public static Scanner scanner = new Scanner(System.in);


  public static boolean ConcatERemove(String s, String t, int k) {
    boolean resp = false;
    int count = 0;

    // removing last char of s until both strings become equal
    while(!t.contains(s) && count < k) {  
      count++;
      s = s.substring(0, s.length() - 1);
    }

    // adding chars from t to s until they become equal
    while(!s.equals(t) && count < k) {
      count++;
      s += t.charAt(s.length());
    }
    
    if(s.equals(t)) {
      resp = true;
    }

    return resp;
  }


  public static void main(String[] args) {
    String s = scanner.next();
    String t = scanner.next();
    int k = scanner.nextInt();

    System.out.println(ConcatERemove(s,t,k)? "Sim" : "Não");
  }
}
