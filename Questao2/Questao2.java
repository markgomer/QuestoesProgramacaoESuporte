import java.util.Scanner;

public class Questao2 {
  public static Scanner scanner = new Scanner(System.in);


  public static boolean ConcatERemove(String s, String t, int k) {
    boolean resp = false; /* variable to be returned at the end of this method */
    int count = 0; /* counter to be added until it matches k */

    // removing last char of s until t starts with s
    while(!t.startsWith(s) && count < k) {  
      count++;
      s = s.substring(0, s.length() - 1);
    }

    // adding chars from t to s until they become equal
    while(!s.equals(t) && count < k) {
      count++;
      s += t.charAt(s.length());
    }
    
    if(s.equals(t)) {
      resp = true; /* updates the response to be returned */
    }

    return resp;
  }


  public static void main(String[] args) {
    boolean repeat = true; /* variable to maintain the reading loop */
    do {
      String s = scanner.next(); /* read the initial string from standard input */
      if(s.equals("FIM")) { /* if test is true, the program ends */
        repeat = false;
      } 
      else {
        String t = scanner.next(); /* read the desired string from standard input */
        int k = scanner.nextInt(); /* read the number of operations from standard input */
        System.out.println(ConcatERemove(s,t,k)? "Sim" : "Não"); /* print the result */
      }
    } while (repeat);

  }
}
