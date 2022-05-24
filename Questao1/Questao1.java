public class Questao1 {
  public static void main(String[] args) {
    int num = 1, max = 100;
    for (int i = num ; i<=max; i++) {
      boolean divPor3 = (i%3 == 0), divPor5 = (i%5 == 0);
      if (divPor3 && divPor5) {
        System.out.println("FooBaa");
      }
      else if (divPor3) {
        System.out.println("Foo");
      } 
      else if (divPor5) {
        System.out.println("Baa");
      }
      else {
        System.out.println(i);
      }
    }
  }
}