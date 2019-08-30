public class CT234 {

  public static int fatorial(int n) {
    if(n == 0)
      return 1;
    return n*fatorial(n-1);
  }

  public static int soma(int n) {
    if(n == 1)
      return 1;
    return n + soma(n-1);
  }

  public static void binario(int n) {
    if(n==1)
      System.out.println(1);
    else
      binario(Math.round(n/2));
    System.out.print(n%2);
  }

  public static void crescente(int n) {
    if(n>1)
      crescente(n-1);
    System.out.print(n);
  } 

  public static void decrescente(int n) {
    System.out.print(n);
    if(n>1)
      decrescente(n-1);
  }

  public static void main(String[] args) {
    int n = 9;

    System.out.println(fatorial(n));

    System.out.println(soma(n));

    binario(n);

    System.out.println();

    crescente(n);

    System.out.println();

    decrescente(n);
  }

}
