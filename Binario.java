
/* Binário Recursivo e com pilha */



public class Main
{
    
    public static int binarioRec(int n){

        if(n == 0)
            return 0;
        return ((n % 2) + 10  *  binarioRec(n/2));
    }
    
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		System.out.println(binarioRec(10));
		
	}
}
