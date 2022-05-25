public class Questao1 {
  public static void main(String[] args) {
    final int start = 1, end = 100; /* limits set on the stated question */
    for (int i = start ; i<=end; i++) {
      boolean divPor3 = (i%3 == 0), divPor5 = (i%5 == 0); /* variables for ease of reading */
      if (divPor3 && divPor5) { /* if divisible by 3 and 5, print FooBaa */
        System.out.println("FooBaa");
      } else if (divPor3) { /* if divisible by 3, print Foo */
        System.out.println("Foo");
      } else if (divPor5) { /* if divisible by 5, print Baa */
        System.out.println("Baa");
      } else {
        System.out.println(i);
      }
    }
  }
}