public class fiboniccs {
	
//	static int fib(int n) {
//		if(n==0||n==1) {
//			return n;
//		}
//		return fib(n-1)+fib(n-2);
//	}
	
	
	static void fib(int n) {
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");
		for(int i=1;i<=n;i++) {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int n=5;
//		int a=0;
//		int b=1;
//		System.out.print(a+" "+b+" ");
//		for(int i=1;i<=n;i++) {
//			int c=a+b;
//			System.out.print(c+" ");
//			a=b;
//			b=c;
		//}
//		
//		for(int i=0;i<7;i++) {
//			System.out.print(fib(i)+" ");
//		}
		
		fib(5);
	}

}
