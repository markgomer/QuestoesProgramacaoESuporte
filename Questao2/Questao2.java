import java.util.Scanner;

public class Questao2 {
  public static Scanner scanner = new Scanner(System.in);


  public static boolean ConcatERemove(final String s, final String t, final int k) {
    boolean resp = false; /* variable to be returned at the end of this method */
    int count = 0; /* counter to be added until it matches k */
    String comparable = s; /* will be used to compare to t and don't change s */

    // removing last char of comparable until t starts with comparable
    while(!t.startsWith(comparable) && count < k) {  
      count++;
      comparable = comparable.substring(0, comparable.length() - 1);
    }

    // adding chars from t to comparable until they become equal
    while(!comparable.equals(t) && count < k) {
      count++;
      comparable += t.charAt(comparable.length());
    }
    
    /**
     * if these conditions are met, the comparable string may be empty and it could
     * have enough empty string removing operations to match k at the end.
     */
    if(s.charAt(0) != t.charAt(0) && k > s.length() + t.length()) {
      resp = true;
    }

    /** 
     * If the comparable equals t and there are no more movements, the conditions are met.
     * If the counter is even, the last char can be added and removed until there are no 
     *  movements left and the comparable will match t.
     */
    if((comparable.equals(t) && (count == k || count%2==0))) { 
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
