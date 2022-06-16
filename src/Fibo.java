import java.util.Arrays;
public class Fibo {
	public static void main(String[] args) {
		int[] var = Fibo.applyFibo1(10);
//		Arrays.toString(Fibo.applyFibo1(10));
		System.out.println(Arrays.toString(var));
		printFibo(var);
		reverseFibo(0);
		
	}
	public static void printFibo(int[] arrayToPrint) {
		for(int i = arrayToPrint.length-1; i >= 0; i--) {
			System.out.println(arrayToPrint[i]);
		}
	}
	public static int[] reverseFibo(int howManyNum) {
		
		return null;
	}
	
	public static int[] applyFibo1(int howManyN) {
		int a = 1;
		int b = 1;
		int[] arrayFibo = new int[howManyN];
		for(int i = 0; i< howManyN; i++) {
			arrayFibo[i] = a;
//			System.out.println(a);
			b = a + b;
			a = b - a;
		}
		return arrayFibo;
	}
	public static void main6(String[] args) {
//		Fibo.applyFibo(10);
		System.out.println(Fibo.applyFibo(10));  
		//Q: quand j'ai essayé de printer il a dit qu'il pouvait pas appliquer boolean à un print ?
	}
	
	public static String applyFibo(int howManyN) {
		int a = 1;
		int b = 1;
		String result = "numbers :";
		for(int i = 0; i< howManyN; i++ ) {
			result = result + " "+ a +",";
			//question sur result comment ça marche
//			System.out.println("first a " +a);
			//question sur print  
			b = a + b;
			a = b - a;
			//System.out.println("last a " +a);
//			a = a + b;
//			a = a - b;
			
		}
//		System.out.println(result);
		return result;
	}
	
	public static void main5(String[] args) {
		int a = 0;
		int b = 1;
		for(int i = 1; i<=10; i++) {
			System.out.println(a);
			b = a + b;
			a = b - a;
		}
		
	}
	public static void main4(String[] args) {
		int a = 0;
		int b = 1;
		for(int i = 1; i<=10; i++) {
			System.out.println(a);
			int c;
			c = a + b;
			a = b;
			b = c;	
		}
	}
	
	public static void main1(String[] args) {
		int a = 1;
		int b = 1;
		for(int i = 1; i<= 10; i++) {
			System.out.println("### debut iteration : a vaut "+a+" et b vaut "+b+" ###");
			System.out.println("fibo " + a);
			//System.out.println("this is b " + b);
			//a = a + 0;
			int futurB;
			System.out.println("on declare futurB avec zero");
			futurB = a + b;
			System.out.println("on met a("+a+") + b("+b+") dans futurB (qui vaut maintenant "+futurB+")");
			a = b;
			System.out.println("on met b("+b+") dans a");
			b = futurB;
			System.out.println("on met futurB("+futurB+") dans b");
			
			
//			int aPasse;
//			aPasse = a;
//			a = b;
//			b = a + aPasse;
			
			//a = c;
			//a = b;
//			a = r;
//			b = a + b;
			
			//System.out.println("this is r " + r);
		}
	}
	
	public static void main3(String[] args) {
		int a = 1;
		int b = 2;
		int c = b;
		b = a;
		a = c;
		System.out.println(a);
		System.out.println(b);
	}

	public static void main2(String[] args) {
		int a = 1;
		int b = 1;
		for(int i = 1; i<= 10; i++) {
			System.out.println("this is a " + a);
			System.out.println("this is b " + b);
			a++;
			int r = a + b;
//			System.out.println("this is a " + a);
//			System.out.println("this is b " + b);
			//System.out.println("this is r " + r);
		}
		
		
	}

//public static void fiboNumber(){
//	for(int i = 0; ) {
//		
//	}
}
